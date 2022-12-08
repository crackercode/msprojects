/*
 * Copyright (c). All rights reserved.
 */
package com.practice.dto;

/**
 * The Class Person.
 *
 * @author Chamara Kendaragama
 * @since 2021
 */
public class Person {

	/** The name. */
	private String name;

	/** The age. */
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * Get name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name.
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Set age.
	 *
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return name;
	}
}
