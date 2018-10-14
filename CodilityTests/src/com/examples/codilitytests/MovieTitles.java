package com.examples.codilitytests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MovieTitles {

	public static void main(String[] ar) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of movie titles you want to sort it");

		int N = scanner.nextInt();
		System.out.println("enter the name of movie titles you want to sort it");

		String movietitles[] = new String[N];

		for (int i = 0; i < N; i++) {
			movietitles[i] = scanner.nextLine();
		}

		System.out.println("enter the substring you are looking for");

		String subString = scanner.nextLine();

		ArrayList<String> movieTitlesContainsSubstring = new ArrayList<>();
		for (String title : movietitles) {
			if (title.contains(subString)) {
				movieTitlesContainsSubstring.add(title);
			}
		}

		Comparator<String> sortMovieNames = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};

		Collections.sort(movieTitlesContainsSubstring, sortMovieNames);

		for (String movieTitles : movieTitlesContainsSubstring) {
			System.out.println(movieTitles);
		}

	}

}
