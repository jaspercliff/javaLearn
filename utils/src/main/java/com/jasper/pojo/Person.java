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
	private int id;

	private String name;

	private Integer age;

	private List<String> hobby;

	public Person(final int id, final String name) {
		this.id = id;
		this.name = name;
	}

	public Person(final String name, final Integer age) {
		this.name = name;
		this.age = age;
	}

	public Person(final String name, final Integer age, final List<String> hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
}
