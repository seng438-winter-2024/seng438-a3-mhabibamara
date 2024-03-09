package org.jfree.data;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class RangeConstrainTest {
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// This calls the setUpBefore even the class exists and does nothing.
	}
	
	//Testing a value that is above the range
	@Test
	public void constrainAboveUpperRange() {
		Range testRange = new Range(1,10);
		double result = testRange.constrain(11.1);
		assertEquals("The value that should be returned is 10", 10, result, .000000001d);
	}
	
	//Testing a value that is below the range
	@Test
	public void constrainBelowLowerRange() {
		Range testRange = new Range(4, 10);
		double result = testRange.constrain(2.0);
		assertEquals("The value that should be returned is 4", 4, result, .000000001d);
	}
	
	// Testing a value within the range
	@Test 
	public void constrainWithinRange() {
		Range testRange = new Range(5,15);
		double result = testRange.constrain(10);
		assertEquals("The value should be returned is 10", 10, result, .000000001d);
	}

}
