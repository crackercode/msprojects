/*
 * Copyright (c). All rights reserved.
 */
package com.pratice.comparablecomparator;

import java.util.Comparator;

import com.practice.dto.Employee;

/**
 * 
 * 
 * @author Chamara Kendaragama
 * @since 2021
 */
public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
