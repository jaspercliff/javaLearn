package com.jasper;

import com.jasper.utils.DateUtil;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

/**
 * @Author jasper @Date 2024-11-05
 *
 * @version 1.0
 */
public class DateUtilTest {

  @Test
  public void firstAndLastDayOfMonth() {
    LocalDate firstDay = DateUtil.firstDayOfMonth(LocalDate.now());
    LocalDate lastDay = DateUtil.LastDayOfMonth(LocalDate.now());
    System.out.println("first= " + firstDay);
    System.out.println("last = " + lastDay);
  }

  @Test
  public void firstAndLastDayOfMonth1(){
    Date first = DateUtil.firstDayOfMonth(new Date());
    System.out.println("first = " + first);
    Date last = DateUtil.LastDayOfMonth(new Date());
    System.out.println("last = " + last);
  }
}
