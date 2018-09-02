package com.dipakbhattarai.learn;

import java.util.Scanner;


public class Mathematics implements Gradient, Distance, Equation {

	private static Scanner scan;

	@Override
	public String equation(double x1, double y1, double gradient) {
		// TODO Auto-generated method stub
		double output = y1 - (gradient*x1);
		String result = "y ="+gradient+"x +" +output;
		return result;
	}

	@Override
	public double distance(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		double result = Math.sqrt((x2 - x1)*(x2 - x1)+ (y2 - y1)*(y2 - y1));
		return result;
	}

	@Override
	public double gradient(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		double result= (y2 - y1)/(x2 - x1);
		return result;
	}

	public static void main(String[] args){
		double x1, x2, y1, y2;
		double dist;
		double gradient;
		String equation;
		
		final Mathematics classUnderTest;
		classUnderTest= new Mathematics();
		
		scan = new Scanner(System.in);
		System.out.println("Enter the x1 coordinate for point 1: ");
		x1 = scan.nextInt();
		System.out.println("Enter the y1 coordinate for point 1: ");
		y1 = scan.nextInt();
		System.out.println("Enter the x2 coordinate for point 2: ");
		x2 = scan.nextInt();
		System.out.println("Enter the y2 coordinate for point 2: ");
		y2 = scan.nextInt();
		
		gradient = classUnderTest.gradient(x1, y1, x2, y2);
		dist = classUnderTest.distance(x1, y1, x2, y2);
		equation = classUnderTest.equation(x1, y1, gradient);
		
		System.out.println("The distance between two points is: "+dist+".");
		System.out.println("The gradient between two points is: "+gradient+".");
		System.out.println("The equation of line between two points is: "+equation+".");
	}
}
