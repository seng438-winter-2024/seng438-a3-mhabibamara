package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class isNaNRangeTest{
	private Range exampleRange;
	private Range exampleRange2;
	private Range exampleRange3;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception { 
    	exampleRange = new Range(-1, 1);
    	exampleRange2 = new Range(Double.NaN, Double.NaN);
    	exampleRange3 = new Range(Double.NaN, 2.0);
    	
    }


    @Test
    public void isNaNRangeTestFalse() {
        assertFalse("isNaN Range", exampleRange.isNaNRange());
    }
    
    @Test
    public void isNaNRangeTestTrue() {
        assertTrue("isNaN Range", exampleRange2.isNaNRange());
    }
    
    @Test
    public void isNaNRangeTestFalse2() {
        assertFalse("isNaN Range", exampleRange3.isNaNRange());
    }
    

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
