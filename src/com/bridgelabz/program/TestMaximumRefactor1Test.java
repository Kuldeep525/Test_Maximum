package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumRefactor1Test {
	TestMaximumRefactor1 testMax = new TestMaximumRefactor1();
	
	  
		@Test
		public void test() {
			int result =  testMax.maximum(9,5, 7 );
			assertEquals(9,result);	
			
		}
		@Test
		public void test2() {
			Double result = testMax.maximum( 6.7, 4.5,9.8);
			assertEquals(9.8,result);	
		}
		@Test
		public void test3() {
			String result = testMax.maximum( "apple","banana","peach" );
			assertEquals("peach",result);
				
		}


}
