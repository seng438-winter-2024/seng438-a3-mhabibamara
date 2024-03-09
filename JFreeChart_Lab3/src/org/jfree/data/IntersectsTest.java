package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IntersectsTest {
	private Range exampleRange;
	private Range exampleRange2;
	private Range exampleRange4;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception { 
    	exampleRange = new Range(-1, 1);
    	exampleRange2 = new Range(5, 10);
    	exampleRange4 = new Range(-5, 10);
    	
    }


    @Test
    public void IntersectsUpperGreaterThanLowerTest() {
        assertTrue("Parameters failed the check",exampleRange.intersects(-5,10));
    }
    
    @Test
    public void IntersectsUpperGreaterThanLowerDoesntIntersectTest() {
        assertFalse("Parameters failed the check",exampleRange.intersects(5,10));
    }
    
    @Test
    public void IntersectsUpperLessThanLowerTest2() {
        assertTrue("Parameters failed the check",exampleRange.intersects(5,-2) == false);
    }
    
    @Test
    public void IntersectsUpperGreaterThanLowerTest2() {
        assertTrue("Parameters failed the check",exampleRange.intersects(exampleRange4));
    }
    
    @Test
    public void IntersectsUpperGreaterThanLowerDoesntIntersectTest2() {
        assertFalse("Parameters failed the check",exampleRange.intersects(exampleRange2));
    }

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

}
