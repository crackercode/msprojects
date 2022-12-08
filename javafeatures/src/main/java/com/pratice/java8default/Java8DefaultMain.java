package com.pratice.java8default;

public class Java8DefaultMain {

	public static void main(String[] args) {

		Formula formula = new Formula() {

			@Override
			public double calculate(int a) {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		System.out.println(formula.sqrt(3));
		System.out.println(formula.add(1, 2));

	}

}
