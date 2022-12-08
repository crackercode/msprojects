
package com.practice.dto;

/**
 * The Class Employee.
 */
public class Employee {

	/** The rollno. */
	private int rollno;

	/** The name. */
	private String name;

	/** The age. */
	private int age;

	public Employee(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

}
