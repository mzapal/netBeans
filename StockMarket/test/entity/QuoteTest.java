/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.util.Date;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author M
 */
public class QuoteTest {
    
    public QuoteTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getPrice method, of class Quote.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Quote instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Quote.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        Quote instance = null;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class Quote.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Quote instance = null;
        Date expResult = null;
        Date result = instance.getDay();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDay method, of class Quote.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        Date day = null;
        Quote instance = null;
        instance.setDay(day);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPriceChange method, of class Quote.
     */
    @Test
    public void testGetPriceChange() {
        System.out.println("getPriceChange");
        Quote instance = null;
        double expResult = 0.0;
        double result = instance.getPriceChange();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceChange method, of class Quote.
     */
    @Test
    public void testSetPriceChange() {
        System.out.println("setPriceChange");
        double priceChange = 0.0;
        Quote instance = null;
        instance.setPriceChange(priceChange);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompany method, of class Quote.
     */
    @Test
    public void testGetCompany() {
        System.out.println("getCompany");
        Quote instance = null;
        Company expResult = null;
        Company result = instance.getCompany();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompany method, of class Quote.
     */
    @Test
    public void testSetCompany() {
        System.out.println("setCompany");
        Company company = null;
        Quote instance = null;
        instance.setCompany(company);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
