/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brunoquerino.balancedbrackets.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class ValidateBracketsTest {
    
    public ValidateBracketsTest() {
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
     * Test of isValidBrackets method, of class ValidateBrackets.
     */
    @Test
    public void testIsValidBrackets() {
        System.out.println("isValidBrackets");
        assertEquals(true, ValidateBrackets.isValidBrackets("0a({}dsdsd[dsdsdd]bc)d"));
        assertEquals(true, ValidateBrackets.isValidBrackets("0a(sas{fd(fg{gfg(gf)gf}gf)gf}dsdsd[dsdsdd]bc)d"));
        assertEquals(false, ValidateBrackets.isValidBrackets("0a(sas{fd(fg{gfg(gf)gf}gf)gf}dsdsd[dsdsdd]bc)}d"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
