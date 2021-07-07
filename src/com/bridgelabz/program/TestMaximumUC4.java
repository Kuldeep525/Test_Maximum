package com.bridgelabz.program;

public class TestMaximumUC4 {
	
	public static <T extends Comparable<T>> T maximum(T w , T x ,T y , T z  ) {
		 T max  = w;
		 if (x.compareTo(max) > 0 ) {
			 max = x;
		 }
		 if (y.compareTo(max) > 0 ) {
			 max = y;
		 }
		 if (z.compareTo(max) > 0 ) {
			 max = z;
		 } 
		return max;
		
	}
	public static void mainn(String[] args) {
		System.out.println("Maximum is " + maximum ("mango","banana","coconut","peach"));
		System.out.println("Maximum is " + maximum (3,4,5,6));
		System.out.println("Maximum is " + maximum (3.5,14.8,5.8,20.0));
	}

}
