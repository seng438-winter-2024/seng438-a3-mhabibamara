package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RangeShiftWithNoZeroCrossingTest {

	public static void setUpBeforeClass() throws Exception {
		// This calls the setUpBefore even the class exists and does nothing.
	}
	
	@Test
	public void shiftWithNoZeroCrossingValueLessThanZero() {
		Range testRange = new Range(-5, 10);
		assertEquals("The shifted value should be 20", 20, testRange.shift(testRange, 10, false).getUpperBound(), .000000001d);
	}
	
	@Test
	public void shiftWithNoZeroCrossingValueEqualZero() {
		Range testRange = new Range(0, 10);
		assertEquals("The shifted value should be 20", 20, testRange.shift(testRange, 10, false).getUpperBound(), .000000001d);
	}
	
	@Test
	public void shiftWithNoZeroCrossingValueGreatThanZero() {
		Range testRange = new Range(-5, 10);
		assertEquals("The shifted value should be 30", 30, testRange.shift(testRange, 20).getUpperBound(), .000000001d);
	}
	
}
