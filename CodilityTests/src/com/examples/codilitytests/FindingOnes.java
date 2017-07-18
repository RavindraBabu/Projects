package com.examples.codilitytests;

public class FindingOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindingOnes c = new FindingOnes();
		int N = c.solution(1000);
		System.out.println(N);
	}

	public int solution(int N) {
		// write your code in Java SE 8
		int count = 0;
		
		for (int i = 1; i <= N; i++) {
			int number = i, number2=i;
			int length = (int) Math.log10(i) + 1;
			
			for ( int j=0; j<length;j++) {
				number = number % 10;
				
				if (number == 1) {
					count++;
				}
				number2 =number2/10;
				number=number2;
			}

		}

		return count;
	}
}
