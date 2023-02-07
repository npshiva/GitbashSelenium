package com.package1;

import java.util.Scanner;

public class find_hypotenuse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		double x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		double y = scanner.nextDouble();
		
		double c = Math.sqrt((x*x)+(y*y));
		
		System.out.println(c);
		
		scanner.close();

	}

}
