package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RangeShiftTest {

	public static void setUpBeforeClass() throws Exception {
		// This calls the setUpBefore even the class exists and does nothing.
	}
	
	@Test
	public void shiftRangeByThree() {
		Range testRange = new Range(2,6);
		assertEquals("Shifting the range by 3 will result in a new range of 5 to 9", new Range(5,9), Range.shift(testRange, 3));
	}
	
	@Test
	public void shiftRangeByTenWithAllowedZeroCrossing() {
		Range testRange = new Range(-1,1);
		assertEquals("Shifting the range by 10 with allowed zero crossing should result in a range range of 9 to 11", new Range(9,11), Range.shift(testRange, 10, true));
	}
	
	@Test
	public void shiftRangeByFiveWithoutAllowedZeroCrossing() {
		Range testRange = new Range(-1, 0);
		assertEquals("Shifting the range by 5 without allowed zero crossing should result in a range of 0 to 5", new Range(0, 5), Range.shift(testRange, 5, false));
	}
}
