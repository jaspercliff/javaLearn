package com.jasper.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-10-21
 */
public class JacksonUtils {
    /**
     * 使用静态内部类实现懒加载  JsonInclude.Include 只影响序列化
     * 默认行为 包含所有字段
     */
    private static class AlwaysMapperHolder {
        private static final ObjectMapper INSTANCE = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.ALWAYS);
    }

    /**
     *排除null值 减少json体积
     */
    private static class NonNullMapperHolder {
        private static final ObjectMapper INSTANCE = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /**
     *  排除null 还排除空值 ""  list.size()=0
     */
    private static class NonEmptyMapperHolder {
        private static final ObjectMapper INSTANCE = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }


    public static String toJsonString(Object o) {
        return toJsonString(o, ALWAYS);
    }

    public static <T> T parseJson(String json, Class<T> valueType) {
        try {
            return AlwaysMapperHolder.INSTANCE.readValue(json, valueType);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting JSON string to object: " + e.getMessage(), e);
        }
    }

    public static String toJsonString(Object o, JsonInclude.Include include) {
        try {
            return selectMapper(include).writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting object to JSON string: ".concat(e.getMessage()), e);
        }
    }

    private static ObjectMapper selectMapper(JsonInclude.Include include) {
        return switch (include) {
            case NON_NULL -> NonNullMapperHolder.INSTANCE;
            case NON_EMPTY -> NonEmptyMapperHolder.INSTANCE;
            default -> AlwaysMapperHolder.INSTANCE; // 默认包含所有字段
        };
    }
}
