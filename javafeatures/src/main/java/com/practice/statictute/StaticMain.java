package com.practice.statictute;

public class StaticMain {

	public static void main(String[] args) {

		Counter c1 = new Counter();
		c1.printCounter();

		Counter c2 = new Counter();
		c2.printCounter();

		StaticMain obj = new StaticMain();

		obj.nonStaticMethod();
		staticMethod();
	}

	private void nonStaticMethod() {
		System.out.println("nonStaticMethod");
	}

	private static void staticMethod() {
		System.out.println("StaticMethod");
	}

}

class Counter {

//	int counter;
	static int counter;

	public Counter() {
		this.counter++;
	}

	public void printCounter() {
		System.out.println(counter);
	}

}
