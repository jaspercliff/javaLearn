package com.jasper;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author jasper @Date 2024-11-05
 *
 * @version 1.0
 */
public class DemoTest {

  @Test
  public void test() {
    System.out.println("Y".hashCode());//89
    System.out.println("Q".hashCode());//81
    System.out.println("M".hashCode());//77
    System.out.println("W".hashCode()); //87
    System.out.println("D".hashCode()); //68


    System.out.println("F".hashCode()); //70
    System.out.println("L".hashCode()); //76
    System.out.println("A".hashCode()); //65
  }


  @Test
  public void test1(){
    Calendar instance = Calendar.getInstance();
    instance.setTime(new Date());
    int i = instance.get(Calendar.DAY_OF_MONTH);
    System.out.println("i = " + i);
  }
}
