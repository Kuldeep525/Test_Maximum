package com.bridgelabz.program;

public class TestMaximumUC5<T extends Comparable<T>> {
	
	T x ,  y ,  z ;
	
	public TestMaximumUC5(T x , T y, T z) {
		this.x = x;
		this.y = y ;
		this.z = z ;
	}
	public static <T extends Comparable<T>> T maximum(T x ,T y, T z) {
		T max = x ;
		if (y.compareTo(max) > 0 ) {
			max = y ; 
		}
		
		if(z.compareTo(max) > 0 ) {
			max = z ; 
		}
		
		return max;
	}

	private  T printMax() {
		System.out.println("Maximum is " + TestMaximumUC5.maximum(x,y,z));
		return TestMaximumUC5.maximum(x,y,z);
	
	}


	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 110;
		Integer c = 1;
		String x = "mango";
		String y = "orange";
		String z = "tomato";
		new TestMaximumUC5<Integer>(a, b, c).printMax();
		new TestMaximumUC5<String>(x , y ,z).printMax();
		 
	 
     
	
	
}
}
