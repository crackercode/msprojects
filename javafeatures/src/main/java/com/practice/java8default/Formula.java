package com.practice.java8default;

@FunctionalInterface
public interface Formula {

	double calculate(int a);

//	int sub(int x, int y);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}

	default double add(int a, int b) {
		return a + b;
	}

}
