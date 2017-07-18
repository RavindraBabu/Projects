package com.examples.javaImeplementation;

import java.util.ArrayList;

public class StringRiverseDemo {

	public static void main(String[] args) {

		String str = "Ashok";
		char ch[] = new char[str.length()];

		char reverse[] = str.toCharArray();

		char l[] = new char[str.length()];
		for (int i = reverse.length-1; i >= 0; i--) {

			l[(reverse.length-1 - i)] = reverse[i];
		}

		str = String.valueOf(l);
		System.out.println("Riverse of the given string " + str);

		ArrayList<Character> jumbled = new ArrayList<>();
		for (char c : str.toCharArray()) {
			jumbled.add(c);
		}

		for (int i = 0; i < str.length(); i++) {
			int number = (int) (Math.random() * jumbled.size());
			ch[i] = jumbled.remove(number);

		}
		str = String.valueOf(ch);
		System.out.println("jumbled charchters of the given string " + str);
	}

}
