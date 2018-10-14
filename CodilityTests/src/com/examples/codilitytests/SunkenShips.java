package com.examples.codilitytests;

import java.util.ArrayList;
import java.util.Arrays;

public class SunkenShips {

	public static void main(String args[]) {

		int N = 4;
		String S = "1B 1C, 2D 4D";
		String T = "2B 2D 3D 4D 4A";

		SunkenShips.solution(N, S, T);
	}

	public static void solution(int N, String S, String T) {

		String ocean[][] = new String[N][4];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				int val = i + 1;
				switch (j) {
				case 0:
					ocean[i][j] = val + "A";
					break;
				case 1:
					ocean[i][j] = val + "B";
					break;
				case 2:
					ocean[i][j] = val + "C";
					break;
				case 3:
					ocean[i][j] = val + "D";
					break;

				}

			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(ocean[i][j] + " ");
			}
			System.out.println("");
		}

		String[] squares = S.split(",");
		ArrayList<String> cells=new ArrayList();
       ArrayList<ArrayList<String>> noOfSquares=new ArrayList<>();
		
		for (int i = 0; i < squares.length; i++) {
			String s[]=squares[i].split("\\s+");
			for(int j=0;j< s.length; j++){
				if(s[j]!=",")
				cells.add(s[j]);
			}
			noOfSquares.add(cells);
		}
		
		
		
	}

}
