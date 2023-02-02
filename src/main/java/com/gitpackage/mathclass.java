package com.gitpackage;

public class mathclass {

	public static void main(String[] args) {
		int x =67;
		int y = 34;
		double a = 3.17;
		double b = 7.67;
		
		int z= Math.max(x, y);
		double c= Math.min(a, b);
		
		System.out.println("max number of x and y: "+z);
		System.out.println("min number of a and b: "+c);
		System.out.println(Math.ceil(c));
		System.out.println(Math.floor(c));

	}

}
