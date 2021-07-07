package com.bridgelabz.program;

public class TestMaximumRefactor2<T extends Comparable<T>> {
	T x ,y ,z;
	
	public TestMaximumRefactor2(T x , T y ,T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}


	public T maximum() {
		return TestMaximumRefactor2.maximum(x , y ,z );
	}
	public static <T extends Comparable<T>> T maximum(T x  , T y , T z  ) {
		T max = x ;
		if (y.compareTo(max) > 0 ) {
			max = y ; 
		}
		
		if(z.compareTo(max) > 0 ) {
			max = z ; 
		}
		
		return max;
	}
	public static void main(String [] args) {
		System.out.println("Maximum is " + maximum ("mango","banana","coconut"));
		System.out.println("Maximum is " + maximum (3,4,5));
		System.out.println("Maximum is " + maximum (3.5,14.8,5.8));
	}


}
