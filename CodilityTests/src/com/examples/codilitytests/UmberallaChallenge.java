package com.examples.codilitytests;

import java.util.Scanner;

public class UmberallaChallenge {
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();

		String numbers = string.replaceAll("\\D+", ",");

		String[] array = numbers.split(",");

		System.out.println(UmberallaChallenge.umberallChallengeSolve(array));
	}

	private static int umberallChallengeSolve(String[] numberss) {
		int solvable = 0, count = 0, notSolvable = 0;
		int numberOfPeople = 0, numberOfumberallas;

		for (String str : numberss) {
			if (!str.equals("")) {
				if (count == 0) {
					numberOfPeople = Integer.parseInt(str);
					count++;
				} else if (Integer.parseInt(str) == 1) {
					solvable = solvable + 1;
					notSolvable++;
				} else {
					numberOfumberallas = Integer.parseInt(str);
					solvable = solvable + numberOfPeople / numberOfumberallas;
					notSolvable = notSolvable + numberOfumberallas * (numberOfPeople / numberOfumberallas);
				}
			}
		}

		if (numberOfPeople == notSolvable) {
			return solvable;
		} else {
			return -1;
		}

	}
}
