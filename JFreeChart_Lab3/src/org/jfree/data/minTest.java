package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class minTest {

    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Test
    public void minTest() {
        assertEquals("min Test Failed", 5.0, Math.min(Double.NaN, 5.0));
    }
    

    

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

}
