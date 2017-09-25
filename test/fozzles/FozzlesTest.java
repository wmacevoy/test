/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fozzles;

import fizzles.Fizzle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wmacevoy
 */
public class FozzlesTest {
    
    public FozzlesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFozzlesFeedFizzles() {
        Fizzle fizzle1 = new Fizzle();
        Fizzle fizzle2 = new Fizzle();
        Fozzle fozzle = new Fozzle();
        
        fozzle.addFizzle(fizzle1);
        fozzle.addFizzle(fizzle2);
        
        fozzle.feedFizzles();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
