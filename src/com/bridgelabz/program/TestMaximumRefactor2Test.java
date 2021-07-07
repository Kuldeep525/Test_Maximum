package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumRefactor2Test {

	@Test
	public void test() {
		TestMaximum testMax = new TestMaximum(6, 8, 7);
		Comparable result = testMax.maximum();
		assertEquals(8, result);
		

	}

}
