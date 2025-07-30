package com.jasper.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-09-27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	String firstName;

	String lastName;

	String email;

	List<User> friends;

}
