package com.examples.codilitytests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CompleteGroups {

	public static void main(String[] args) throws IOException {

		int groups[] = new int[5];

		BufferedReader buffereReader = new BufferedReader(new InputStreamReader(System.in));

		String jumbledString = buffereReader.readLine();

		char[] jumbledCharacters = jumbledString.toCharArray();

		for (int i = 0; i <= jumbledCharacters.length - 1; i++) {

			char c = jumbledCharacters[i];

			switch (c) {
			case 'p':
				groups[0]++;
				break;
			case 'b':
				groups[1]++;
				break;

			case 'z':
				groups[2]++;
				break;

			case 'c':
				groups[3]++;
				break;

			case 'm':
				groups[4]++;
				break;
			}
		}

		Arrays.sort(groups);

		System.out.println("minimum number of groups" + groups[0]);
	}
}
