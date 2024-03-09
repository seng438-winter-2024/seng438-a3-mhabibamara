package org.jfree.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class RangeEqualsTest {
	
	public static void setUpBeforeClass() throws Exception {
		// This calls the setUpBefore even the class exists and does nothing.
	}
	
	//Testing 2 objects that are not equal
	@Test
	public void intObjectIsNotARangeObject() {
		Integer testInt = Integer.valueOf(5);
		Range testRange = new Range(1,4);
		assertFalse("The Integer Object is not a Range Object and so the function should return false", testRange.equals(testInt));
	}
	
	//Testing 2 Range objects that are equal
	@Test
	public void rangeObjectsAreEqual() {
		Range testRange1 = new Range(1,5);
		Range testRange2 = new Range(1,5);
		assertTrue("The range objects are equal and should return true", testRange1.equals(testRange2));
	}
	
	//Testing 2 Ranges with equal lower bound, but will still not be equal overall
	@Test
	public void lowerBoundRangeObjectsEqual() {
		Range testRange1 = new Range(1,5);
		Range testRange2 = new Range(1, 10);
		assertFalse("The ranges are not equal", testRange1.equals(testRange2));
	}
	
	//Testing 2 Ranges with equal upper bound, but will still not be equal overall
	@Test
	public void upperBoundRangeObjectsEqual() {
		Range testRange1 = new Range(3, 12);
		Range testRange2 = new Range(10, 12);
		assertFalse("The ranges are not equal", testRange1.equals(testRange2));
	}
}
