package com.examples.codilitytests;

import java.util.ArrayList;
import java.util.List;

public class InterestingPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String S = "15:15:00", T = "15:15:12";
		 String S = "22:22:21", T = "22:22:23";
		 InterestingPoints i= new InterestingPoints();
		 int s=i.solution(S, T);
		 System.out.println(s);
	
	}

	
	public int solution(String S, String T){
		String arr1[] = S.split(":");
		String arr2[] = T.split(":");

		int k, n;
		k = Integer.parseInt(arr1[2]);
		n = Integer.parseInt(arr2[2]);
		String s;
		List<String> timestamps = new ArrayList<>();
		for (int i = k; i <= n; i++) {
			if (i <= 9)
				s = arr1[0] + ":" + arr1[1] + ":0" + i;
			else
				s = arr1[0] + ":" + arr1[1] + ":" + i;
			timestamps.add(s);

		}

		int count1 = 0;
		// int l, m;
		char c, m,d;
		for (int i = 0; i < timestamps.size(); i++) {
			int count2 = 0;
			String input = timestamps.get(i);
			String arr3[] = input.split(":");

			
				for (int g = 0; g < arr3[2].length(); g++) {
					c = arr3[0].charAt(0);
					d = arr3[0].charAt(1);
					m = arr3[2].charAt(g);
					if ((m == c)||(d == c)) {
						count2++;
					}
				}

			
			if (count2 == 2) {
				count1++;
			}

		}
		return count1;
	}
}
