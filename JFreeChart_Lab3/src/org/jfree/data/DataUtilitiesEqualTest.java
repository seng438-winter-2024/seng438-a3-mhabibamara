package org.jfree.data;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.*;
import org.junit.Test;
import org.jmock.Expectations;
import org.jmock.Mockery;


public class DataUtilitiesEqualTest extends DataUtilities {
	
		
	@BeforeClass 
	public static void setUpBeforeClass() throws Exception {}
	
	
	@Test
	public void twoNullArraysTest() {
		double array1[][] = null;
		double array2[][] = null;
		assertTrue("The arrays should be equal", DataUtilities.equal(array1, array2));
	}
	
	@Test
    public void firstArrayNullTest() {
        double array1[][] = null;
        double array2[][] = {{1,2,3,4,5}};
        assertFalse("The arrays should not be equal", DataUtilities.equal(array1, array2));
    }
    
    @Test
    public void secondArrayNullTest() {
        double array1[][] = {{1,2,3,4,5}};
        double array2[][] = null;
        assertFalse("The arrays should not be equal", DataUtilities.equal(array1, array2));
    }
	
	@Test
	public void twoEmptyArraysTest() {
		double array1[][] = {};
		double array2[][] = {};
		assertTrue("The arrays should be equal", DataUtilities.equal(array1, array2));
	}
	
	@Test
	public void checkTwoArraysNotEqualLength() {
		double array1[][] = {{1,2,3,4,5}};
		double array2[][] = {{1,2,3}};
		assertFalse("The arrays should not be equal", DataUtilities.equal(array1, array2));
	}
	
	@Test
	public void checkTwoArraysNotEqualSize() {
		double array1[][] = {{1,2,3,4,5}};
		double array2[][] = {{1,2,3}, {1,2,3}};
		assertFalse("The arrays should not be equal", DataUtilities.equal(array1, array2));
	}
	
	@Test
	public void checkTwoValidArrays() {
		double array1[][] = {{1,2,3}};
		double array2[][] = {{1,2,3}};
		assertTrue("The arrays should be equal",DataUtilities.equal(array1, array2));
	}
		
	
	 @After
	 public void tearDown() throws Exception {}

     @AfterClass
     public static void tearDownAfterClass() throws Exception {}	
}