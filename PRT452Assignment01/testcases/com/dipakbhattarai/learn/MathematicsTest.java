package com.dipakbhattarai.learn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MathematicsTest {
	
	private Mathematics classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new Mathematics();
	}

	@Test
	public void testGradient(){
		double x1 = 10;
		double y1 = 12;
		double x2 = 12;
		double y2 = 15;

		double result = (y2 - y1)/(x2 - x1);
		
		//compare to Mathematics java
		assertEquals(result, classUnderTest.gradient(10, 12, 12, 15), 0.001);
	}

	@Test
	public void testDistance(){
		double x1 = 10;
		double y1 = 10;
		double x2 = 13;
		double y2 = 14;

		double result = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		//compare to Mathematics java
		assertEquals(result, classUnderTest.distance(10, 10, 13, 14), 0.001);
	}

	@Test
	public void testEquation(){
		double x1 =1;
		double y1=3;
		double gradient =1;
		double output = y1 - (gradient*x1);
		
		String result= "y ="+gradient+"x +" +output;
		assertEquals(result, classUnderTest.equation(x1, y1, gradient));
	}

}
