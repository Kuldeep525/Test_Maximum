package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumUC3Test {
	
		TestMaximumUC3 testMax = new TestMaximumUC3();

		@Test
		public void test1() {
			String result = testMax.maximum( "peach","apple","banana");
			assertEquals("peach",result);
			
		}
		@Test
		public void test2() {
		String result = testMax.maximum( "apple","peach" , "banana");
			assertEquals("peach",result);
			
		}
		@Test
		public void test3() {
			String result = testMax.maximum( "apple","banana","peach" );
			assertEquals("peach",result);
				
		}


}

