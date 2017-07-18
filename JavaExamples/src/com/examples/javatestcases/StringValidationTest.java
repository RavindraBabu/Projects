package com.examples.javatestcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.examples.javaImeplementation.StringValidation;

public class StringValidationTest {
	
	@Test
	public void stringValidationExample(){
		StringValidation stringValidation=new StringValidation();
		boolean b=true;
		boolean s=stringValidation.isBalanced("(a+b)");
		assertEquals(b,s);
	}

}
