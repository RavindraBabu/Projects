package com.examples.codilitytests;

public final class FizzBuzzDemo {

	public final String fizzBuzzMethod(int number) {

		String str = null;
		if ((number > 0) && (number < 100)) {

			if ((number % 5 == 0) && (number % 3 == 0)) {
				System.out.println("it is sizz and buzz");
				str = "it is sizz and buzz";
				// break;
				return str;
			} else if (number % 5 == 0) {
				str = "it is a buzz";
				System.out.println("it is a buzz");
				return str;
			} else if (number % 3 == 0) {
				str = "it is a sizz";
				System.out.println("it is a sizz");
				return str;
			}

		} else {
			System.out.println("please enter the other number");
			str = "please enter the other number";
		}
		return str;

	}

}
