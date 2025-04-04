package com.jasper.utils;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

/**
 * @version 1.0 @Author jasper @Date 2024-11-05
 */
public class DateUtil {
  private final static String SIMPLE_PATTERN = "yyyyMMdd";
  private final static String DEFAULT_PATTERN  = SIMPLE_PATTERN;
  public static LocalDate firstDayOfMonth(LocalDate date) {
    return date.with(TemporalAdjusters.firstDayOfMonth());
  }

  public static LocalDate LastDayOfMonth(LocalDate date) {
    return date.with(TemporalAdjusters.lastDayOfMonth());
  }

  public static int getDayOfMonth(LocalDate date) {
    return date.getDayOfMonth();
  }

  public static Date firstDayOfMonth(Date date) {
    Calendar instance = Calendar.getInstance();
    instance.setTime(date);
    instance.set(instance.get(Calendar.YEAR), instance.get(Calendar.MONTH), 1);
    return instance.getTime();
  }

  public static Date LastDayOfMonth(Date date) {
    Calendar instance = Calendar.getInstance();
    instance.setTime(date);
    instance.set(instance.get(Calendar.YEAR), instance.get(Calendar.MONTH), 1);
    instance.add(Calendar.MONTH, 1); // 下个月第一天
    instance.add(Calendar.DAY_OF_MONTH, -1);
    return instance.getTime();
  }

  public static int getDayOfMonth(Date date) {
    Calendar instance = Calendar.getInstance();
    instance.setTime(date);
    return instance.get(Calendar.DAY_OF_MONTH);
  }
}
