package com.lti.demo.MavenAppLTI;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd1() {
		int res=new Calculator().add(10, 30);
		assertEquals(40,res);
		
	}
	@Test
	public void testAdd2() {
		int res=new Calculator().add(-10, 20);
		assertEquals(10,res);
		
	}
	@Test
	public void prod() {
		int res=new Calculator().prod(1, 3);
		assertEquals(3,res);
		
	}
	@Test
	public void prod1() {
		int res=new Calculator().prod(10, 30);
		assertEquals(300,res);
		
	}

}
