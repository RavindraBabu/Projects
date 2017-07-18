package com.examples.codilitytests;

import java.util.ArrayList;

public class FlamesCodeDemo {

	public static void main(String[] args) {
		int result;
		String S, T;
		S = "lemon";
		T = "melon";
		FlamesCodeDemo s = new FlamesCodeDemo();
		result = s.solution(S, T);
		System.out.println(result);
	}

	public int solution(String S, String T) {

		ArrayList<Character> firstWord = new ArrayList<Character>();
		for (char c : S.toCharArray()) {
			firstWord.add(c);
		}
		ArrayList<Character> secondWord = new ArrayList<Character>();
		for (char c : T.toCharArray()) {
			secondWord.add(c);
		}
		boolean flag = false;
		for (int i = 0; i < firstWord.size();) {
			for (int j = 0; j < secondWord.size(); j++) {

				if (firstWord.get(i).equals(secondWord.get(j))) {
					firstWord.remove(i);
					secondWord.remove(j);
					flag = true;
					break;
				}

			}
			if (flag) {
				flag=false;
			} else {
				i++;
			}

		}

		return firstWord.size() + secondWord.size();

	}
}
