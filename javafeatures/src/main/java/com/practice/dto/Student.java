package com.practice.dto;

import java.util.Date;

/**
 * The Class Student.
 */
public class Student implements Comparable<Student> {

	/** The rollno. */
	int rollno;

	/** The name. */
	String name;

	/** The age. */
	int age;

	Date birthday;

	public Student(int rollno, String name, int age, Date birthday) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + rollno;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (rollno != other.rollno)
//			return false;
//		return true;
//	}

//	 compareTo for string field
	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}

	// compareTo by age
//	@Override
//	public int compareTo(Student o) {
//		if (age == o.age)
//			return 0;
//		else if (age > o.age)
//			return 1;
//		else
//			return -1;
//	}

	// compare to by date
//	@Override
//	public int compareTo(Student o) {
//
//		return this.birthday.compareTo(o.getBirthday());
//	}

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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

}
