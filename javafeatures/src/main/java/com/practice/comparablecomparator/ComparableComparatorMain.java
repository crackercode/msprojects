package com.practice.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import com.practice.dto.Employee;
import com.practice.dto.Student;

public class ComparableComparatorMain {

	public static void main(String[] args) {

		Date today = new Date();
		Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
		Date dayAftertomorrow = new Date(today.getTime() + 2 * (1000 * 60 * 60 * 24));

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23, today));
		al.add(new Student(106, "Ajay", 27, dayAftertomorrow));
		al.add(new Student(105, "Jai", 21, tomorrow));

		Collections.sort(al);

		al.stream().forEach(System.out::println);
		System.out.println("");

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Vijay", 23));
		empList.add(new Employee(106, "Ajay", 27));
		empList.add(new Employee(105, "Jai", 21));

		Collections.sort(empList, new NameComparator());

		empList.stream().forEach(System.out::println);
		System.out.println("");

		Collections.sort(empList, new AgeComparator());

		empList.stream().forEach(System.out::println);

	}

}
