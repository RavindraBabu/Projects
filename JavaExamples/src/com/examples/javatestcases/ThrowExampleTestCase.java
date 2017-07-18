package com.examples.javatestcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.examples.javaImeplementation.Student;
import com.examples.javaImeplementation.ThrowExampleDemo;

public class ThrowExampleTestCase {

	@Test(expected = NullPointerException.class)
	public void stundent_Details_Checking() {
		String str = "Student name= Ravindra, age= 25";
		ThrowExampleDemo ex = new ThrowExampleDemo();
		String string_test = ex.display();
		assertEquals(str, string_test);

	}

	@Test(timeout=10)
	public void stundent_Details_Checking2() {
		Student st = new Student();
		st.setName("Ravindra");
		st.setAge(25);
		String str = "Student name= Ravindra, age= 25";
		String string_test = st.toString();
		assertEquals(str, string_test);

	}

}
