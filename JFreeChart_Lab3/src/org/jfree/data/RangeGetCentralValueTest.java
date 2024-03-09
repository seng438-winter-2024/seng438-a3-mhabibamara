package org.jfree.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class RangeGetCentralValueTest {

	public static void setUpBeforeClass() throws Exception {
		// This calls the setUpBefore even the class exists and does nothing.
	}
	
	//Testing the CentralValue method to check the values between the range
	@Test
	public void centralValueBetweenRange() {
		Range testRange = new Range(4,6);
		assertEquals("The central value of the Range between 4 and 6 should be 2", 2, testRange.getCentralValue(), 0.000001d);
	}
}
