package com.bridgelabz.program;

public class TestMaximumUC2 {
	
	public static <T extends Comparable<T>> T maximum(T x ,T y , T z ) {
		T max = x;
		if(y.compareTo(max) > 0 ){
			max = y;
		}
		if(z.compareTo(max) > 0 ) {
			max = z;
		}
		return max ;
	}
	public static void main(String[] args) {
		System.out.println("Maximum is  " + maximum(6.6,
		        8.8, 7.7));
	}
}
