package com.jasper.collect.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author jasper @Date 2024-12-26
 *
 * @version 1.0 @Description
 */
public class mapDemo {
  public static void main(String[] args) {
    HashMap<String, Object> map = new HashMap<>();
    map.put("YUQ-PRI", 1);
    map.put("YUQ-INT", 1);
    map.put("YUQ-ODP", 1);
    map.put("YUQ-ODI", 1);
    map.put("FYJ-PRI", 1);
    map.put("FYJ-INT", 1);
    map.put("FYJ-ODP", 1);

    HashMap<String, Object> hashMap1 = new HashMap<>();
    Set<String> keySet = map.keySet();
    Iterator<String> iterator = keySet.iterator();

    double temp = 0;
    while (iterator.hasNext()) {
      String s = iterator.next();
      Integer o = (Integer) map.get(s);
      Double value = o * 0.95;
      temp += value;
      if (!iterator.hasNext()) {
        double temp1 = 7 - temp;
        hashMap1.put(s, temp1);
      }else {
        hashMap1.put(s, value);
      }
    }

    System.out.println(hashMap1);
  }
}
