package org.jfree.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class RangeScaleTest {

	public static void setUpBeforeClass() throws Exception {
		// This calls the setUpBefore even the class exists and does nothing.
	}
	
	//Testing scaling a range with a negative factor
	@Test
	public void scalingRangeWithNegativeFactor() {
		Range testRange = new Range(1,10);
		Range scaledRange = testRange.scale(testRange, -5);
		fail("This method will throw an exception");
	}
	
	//Testing scaling a range with a positive factor
	@Test
	public void scalingRangeWithPositiveFactor() {
		Range testRange = new Range(1,10);
		Range scaledRange = testRange.scale(testRange, 2);
		assertEquals("The upper bound value should be 20", 20, scaledRange.getUpperBound(), .000000001d);
	}
}
