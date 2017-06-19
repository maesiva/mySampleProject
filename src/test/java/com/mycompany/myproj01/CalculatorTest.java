/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myproj01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Swaroop
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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

    /**
     * Test of addNumbers method, of class Calculator.
     */
    @org.junit.Test
    public void testAddNumbers() {
        System.out.println("addNumbers");
        int n1 = 10;
        int n2 = 5;
        Calculator instance = new Calculator();
        int expResult = 15;
        int result = instance.addNumbers(n1, n2);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtractNumbers method, of class Calculator.
     */
    @org.junit.Test
    public void testSubtractNumbers() {
        System.out.println("subtractNumbers");
        int n1 = 15;
        int n2 = 4;
        Calculator instance = new Calculator();
        int expResult = 11;
        int result = instance.subtractNumbers(n1, n2);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplyNumbers method, of class Calculator.
     */
    @org.junit.Test
    public void testMultiplyNumbers() {
        System.out.println("multiplyNumbers");
        int n1 = 10;
        int n2 = 5;
        Calculator instance = new Calculator();
        int expResult = 50;
        int result = instance.multiplyNumbers(n1, n2);
        assertEquals(expResult, result);
    }
    
}
