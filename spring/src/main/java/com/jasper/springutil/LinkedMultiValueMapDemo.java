package com.jasper.springutil;

import org.springframework.util.LinkedMultiValueMap;

import java.util.*;

/**
 * @Author jasper @Date 2024-11-19
 *
 * @version 1.0
 *     <p>保持插入顺序 一个键对应多个值
 */
public class LinkedMultiValueMapDemo {
  public static void main(String[] args) {
    LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<>();
    map.add("key1", "value1");
    map.addAll("key1", Arrays.asList("1", "2"));
    Set<Map.Entry<String, List<String>>> entries = map.entrySet();
    for (Map.Entry<String, List<String>> entry : entries) {
      System.out.println(entry.getKey()+"---"+entry.getValue());
    }
  }
}
