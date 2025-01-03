package com.jasper.utils;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @Author jasper @Date 2025-01-03
 *
 * @version 1.0 @Description
 */
public class BigDecimalUtil {

    public static BigDecimal nullToZero(BigDecimal bigDecimal){
        return Optional.ofNullable(bigDecimal).orElse(BigDecimal.ZERO);
    }

    public static BigDecimal toBigDecimal(Object o){
        if (o == null){
            return null;
        }else if (o instanceof String){
            String str = (String) o;
            return "".equals(str)?null: new BigDecimal(str);
        }else {
            return new BigDecimal(String.valueOf(o));
        }
    }
}
