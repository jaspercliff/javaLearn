package com.jasper.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-10-21
 */
public class JacksonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String toJsonString(Object o){
        if (o!=null){
            try {
               return mapper.writeValueAsString(o);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }else{
            return null;
        }
    }
}
