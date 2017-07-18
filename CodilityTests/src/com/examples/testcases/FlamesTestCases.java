package com.examples.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.examples.codilitytests.FlamesCodeDemo;




public class FlamesTestCases {
	
	@Test
	public void solutionTest(){
		
		String S, T;
		S = "finally";
		T = "final";
		FlamesCodeDemo s = new FlamesCodeDemo();
		int result = s.solution(S, T);
		assertEquals(result,2);
		
	}

	
}
