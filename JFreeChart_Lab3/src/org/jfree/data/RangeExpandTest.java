package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.*;

public class RangeExpandTest {

	private Range expandRange;

	@Before
	public void setUp() throws Exception {
		expandRange = new Range(-1.0, 1.0);
	}

	@Test
	public void expandLowerBoundToZero() {
        Range testRange = Range.expand(expandRange, -1.0, -1.0);
        assertEquals("Lower boundary should be 0", 0, testRange.getLowerBound(), .000000001d);
    }
    
    @Test
    public void expandLowerBoundToNegative() {
        Range testRange = Range.expand(expandRange, 1.0, 1.0);
        assertEquals("Lower boundary should be -3.0", -3.0, testRange.getLowerBound(), .000000001d);
    }

	// End of Tests
	@After
	public void tearDown() throws Exception {
	}

}
