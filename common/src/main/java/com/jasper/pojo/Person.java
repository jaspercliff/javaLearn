package com.jasper.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-09-30
 */
@Data
@AllArgsConstructor
public class Person {

	private String name;

	private Integer age;

	private List<String> hobby;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
}
