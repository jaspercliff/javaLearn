package com.jasper.utils;


/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-11-05
 */
public class LogUtil {
    private static final String EMPTY_JSON = "{}";
    private static final String COMMA = ",";

    public static String toJsonLog(Object obj) {
        try {
            if (obj == null) {
                return EMPTY_JSON;
            }
            if (obj instanceof String) {
                return obj.toString();
            }
            return JacksonUtil.toJsonString(obj);
        } catch (Exception e) {
            return null;
        }
    }

    public static String toJsonLogs(Object... objects) {
        StringBuilder logs = new StringBuilder();
        for (Object object : objects) {
            logs.append(toJsonLog(object));
            logs.append(COMMA);
        }
        return logs.toString();
    }
}
