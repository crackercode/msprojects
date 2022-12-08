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
public class AgeComparator implements Comparator<Employee> {

	public int compare(Employee s1, Employee s2) {
		if (s1.getAge() == s2.getAge())
			return 0;
		else if (s1.getAge() > s2.getAge())
			return 1;
		else
			return -1;
	}

}
