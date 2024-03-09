package org.jfree.data;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.*;
import org.junit.Test;
import org.jmock.Expectations;
import org.jmock.Mockery;


public class DataUtilitiesCloneTest {
	
	
	public Mockery mockingContext;
	private Values2D values;
	
	@BeforeClass 
	public static void setUpBeforeClass() throws Exception {}
	
    @Before
    public void setUp() {
    	
    	// setup
	     mockingContext = new Mockery();
	     
	     values = mockingContext.mock(Values2D.class);
	     mockingContext.checking(new Expectations() 
	     {
	         {
	             one(values).getRowCount();
	             will(returnValue(3));
	             
	             one(values).getColumnCount();
	             will(returnValue(3));
	             
	             // [ 2, -3 , -6]
	             // [ 3, 2 , -9]
	             // [ 4, 9 , -12]
	             
	             one(values).getValue(0, 0);
	             will(returnValue(2.0));
	             
	             one(values).getValue(0, 1);
	             will(returnValue(-3.0));
	             
	             one(values).getValue(0, 2);
	             will(returnValue(-6.0));

	             one(values).getValue(1, 0);
	             will(returnValue(3.0));
	             
	             one(values).getValue(1, 1);
	             will(returnValue(2.0));
	             
	             one(values).getValue(1, 2);
	             will(returnValue(-9.0));
	             
	             one(values).getValue(2, 0);
	             will(returnValue(4.0));
	             
	             one(values).getValue(2, 1);
	             will(returnValue(9.0));
	             
	             one(values).getValue(2, 2);
	             will(returnValue(-12.0));

	         }
	     }
	     );  	
    }
    
	@Test
	public void emptyArrayClone() {
		double[][] testArray = {{}}; 
		double[][] resultArray = DataUtilities.clone(testArray);
		assertArrayEquals(testArray, resultArray);
	}
	
	@Test
	public void invalidDataClone() {
		double[][] testArray = {null};
		double[][] resultArray = DataUtilities.clone(testArray); 
		assertArrayEquals(testArray, resultArray);
	}

	@Test
	public void positiveDataClone() {
		double[][] testArray = {{1, 2}, {3, 4}};
		double[][] actualArray = DataUtilities.clone(testArray);
		assertArrayEquals(testArray, actualArray);
	}

	@Test
	public void negativeDataClone() {
		double[][] testArray = {{-1, -2}, {-3, -4}};
		double[][] actualArray = DataUtilities.clone(testArray);
		assertArrayEquals(testArray, actualArray);
	}
      
    
	 @After
	 public void tearDown() throws Exception {}

     @AfterClass
     public static void tearDownAfterClass() throws Exception {}	
}