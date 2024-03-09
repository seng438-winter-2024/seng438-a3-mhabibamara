package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class combineIgnoringNaNRangeTest{

    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Test
    public void range1NullTest() {
        assertEquals("Range is NULL", new Range(2,6), Range.combineIgnoringNaN(null, new Range(2,6)));
    }
    
    @Test
    public void range2NullTest() {
        assertEquals("Range is Null", new Range(2,6), Range.combineIgnoringNaN(new Range(2,6), null));
    }
    
    @Test
    public void rangereturnNullTest() {
        assertNull("Range is Null", Range.combineIgnoringNaN(null, new Range(Double.NaN, Double.NaN)));
    }
    
    @Test
    public void rangereturnNullTest2() {
        assertNull("Range is Null", Range.combineIgnoringNaN(new Range(Double.NaN, Double.NaN), null));
    }
    
    @Test
    public void rangesNotNullTest() {
        assertNull("Range is Null", Range.combineIgnoringNaN(new Range(Double.NaN, Double.NaN), new Range(Double.NaN, Double.NaN)));
    }
    
    @Test
    public void rangesNotNullTest2() {
        assertEquals("Range is Null", new Range(-5,10), Range.combineIgnoringNaN(new Range(-5,0), new Range(9,10)));
    }
    
    @Test
    public void extraTestForMinLine() {
        assertEquals("Range is Null", new Range(5,Double.NaN), Range.combineIgnoringNaN(new Range(5, Double.NaN), new Range(Double.NaN, Double.NaN)));
    }
    
    @Test
    public void extraTestForMaxLine() {
        assertEquals("Range is Null", new Range(5, 5), Range.combineIgnoringNaN(new Range(Double.NaN, 5), new Range(5, Double.NaN)));
    }
    


    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

}
