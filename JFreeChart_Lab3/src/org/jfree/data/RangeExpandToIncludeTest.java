package org.jfree.data;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RangeExpandToIncludeTest {

	public static void setUpBeforeClass() throws Exception {
		// This calls the setUpBefore even the class exists and does nothing.
	}
	
	@Test
	public void expandToIncludeUpperBound() {
		Range testRange = Range.expandToInclude(new Range(1,4), 10);
		assertEquals("This will include 10 by expanding the range 1,4 to 1,10", new Range(1,10), testRange);
	}
	
	@Test
	public void expandToIncludeLowerBound() {
		Range testRange = Range.expandToInclude(new Range(3, 10), -4);
		assertEquals("This include -4 by expanding the lower bound of the range 3,10 to -4,10", new Range(-4,10), testRange);
	}
	
	@Test
	public void expandToIncludeNullLowerBound() {
		Range testRange = Range.expandToInclude(null, 2);
		assertEquals("The lower value will expand to 2", 2, testRange.getLowerBound(), .000000001d);
	}
	
	@Test
	public void expandToIncludeNominalValue() {
		Range testRange = Range.expandToInclude(new Range(-1, 1), 0);
		assertEquals("To include 0 in this range it will remain at range of -1,1", new Range(-1,1), testRange);
	}
	
	@Test
	public void expandToIncludeNullRange() {
		Range testRange = Range.expandToInclude(null, 0);
		assertEquals("To include 0 in the range of null it will go to 0,0", new Range(0,0), testRange);
	}
	
}
