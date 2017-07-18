package com.examples.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.examples.codilitytests.FizzBuzzDemo;

public class FizzBuzzTestDemo {
	FizzBuzzDemo fizzBuzz;

	@Before
	public void initIalization() {
		fizzBuzz = new FizzBuzzDemo();
	}

	@Test
	public void arithmeticNumberTesting() {
		String str;
		str = fizzBuzz.fizzBuzzMethod(15);
		assertEquals(str, "it is sizz and buzz");
	}

	@Test
	public void arithmeticNumberTesting2() {
		String str;
		str = fizzBuzz.fizzBuzzMethod(9);
		assertEquals(str, "it is a sizz");
	}

	@Test
	public void arithmeticNumberTesting3() {
		String str;

		str = fizzBuzz.fizzBuzzMethod(101);
		assertEquals(str, "please enter the other number");

	}

}
