package com.jasper.utils;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

/**
 * @version 1.0 @Author jasper @Date 2024-11-05
 */
public class DateUtil {
  public static LocalDate firstDayOfMonth(LocalDate date) {
      return date.with(TemporalAdjusters.firstDayOfMonth());
  }

  public static LocalDate LastDayOfMonth(LocalDate date){
    return  date.with(TemporalAdjusters.lastDayOfMonth());
  }

  public static Date firstDayOfMonth(Date date){
    Calendar instance = Calendar.getInstance();
    instance.setTime(date);
    instance.set(instance.get(Calendar.YEAR),instance.get(Calendar.MONTH),1);
    return instance.getTime();
  }


  public static Date LastDayOfMonth(Date date){
    Calendar instance = Calendar.getInstance();
    instance.setTime(date);
    instance.set(instance.get(Calendar.YEAR),instance.get(Calendar.MONTH),1);
    instance.add(Calendar.MONTH,1); //下个月第一天
    instance.add(Calendar.DAY_OF_MONTH,-1);
    return instance.getTime();
  }

}
