package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumUC2Test {
	TestMaximumUC2 testMax = new TestMaximumUC2();

	@Test
	public void test1() {
		Double result = testMax.maximum(9.8, 6.7, 4.5);
		assertEquals(9.8,result);
		
	}
	@Test
	public void test2() {
		Double result = testMax.maximum( 6.7,9.8, 4.5);
		assertEquals(9.8,result);
		
	}
	@Test
	public void test3() {
		Double result = testMax.maximum( 6.7, 4.5,9.8);
		assertEquals(9.8,result);	
	}



}
