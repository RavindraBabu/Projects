package com.examples.java8features;

import java.util.ArrayList;

public class FunctionalProgramming2 {
	public static String str = "darling";

	public static void main(String args[]) {

		Message m = str -> System.out.println("hi " + str);

		m.printMessage(str);

		ArrayList al = new ArrayList<>();
		al.add("hi");
		al.add(" String ");

		al.forEach(System.out::println);

		addingStrings a = (String str1, String str2) -> System.out.println(str1 +" "+ str2);
		
		a.printMessage(str, str);

	}

	interface Message {
		void printMessage(String str);
	}

	interface addingStrings {

		void printMessage(String str, String str2);
	}
}
