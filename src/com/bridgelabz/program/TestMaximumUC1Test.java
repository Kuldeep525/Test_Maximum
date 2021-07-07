package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumUC1JunitTest {
	TestMaximumUC1 testMax = new TestMaximumUC1();
     
	@Test
	public void test() {
		int result =  testMax.maximum(9,5, 7 );
		assertEquals(9,result);	
		
	}
	@Test
	public void test2(){
		int result =  testMax.maximum(5,9,7);
		assertEquals(9,result);
	}
	@Test
	public void test3() {
		int result = testMax.maximum(5,7,9);
		assertEquals(9 ,result);
	}

}
