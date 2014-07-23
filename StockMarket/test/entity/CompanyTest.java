/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.util.List;
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
public class CompanyTest {
    
    public CompanyTest() {
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
     * Test of getName method, of class Company.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Company instance = new Company();
        String expResult = "";
        String result = instance.getName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Company.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Company instance = new Company();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSymbol method, of class Company.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Company instance = new Company();
        String expResult = "";
        String result = instance.getSymbol();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSymbol method, of class Company.
     */
    @Test
    public void testSetSymbol() {
        System.out.println("setSymbol");
        String symbol = "";
        Company instance = new Company();
        instance.setSymbol(symbol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSector method, of class Company.
     */
    @Test
    public void testGetSector() {
        System.out.println("getSector");
        Company instance = new Company();
        String expResult = "";
        String result = instance.getSector();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSector method, of class Company.
     */
    @Test
    public void testSetSector() {
        System.out.println("setSector");
        String sector = "";
        Company instance = new Company();
        instance.setSector(sector);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuotes method, of class Company.
     */
    @Test
    public void testGetQuotes() {
        System.out.println("getQuotes");
        Company instance = new Company();
        List expResult = null;
        List result = instance.getQuotes();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuotes method, of class Company.
     */
    @Test
    public void testSetQuotes() {
        System.out.println("setQuotes");
        List<Quote> quotes = null;
        Company instance = new Company();
        instance.setQuotes(quotes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastQuote method, of class Company.
     */
    @Test
    public void testGetLastQuote() {
        System.out.println("getLastQuote");
        Company instance = new Company();
        Quote expResult = null;
        Quote result = instance.getLastQuote();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastQuote method, of class Company.
     */
    @Test
    public void testSetLastQuote() {
        System.out.println("setLastQuote");
        Quote lastQuote = null;
        Company instance = new Company();
        instance.setLastQuote(lastQuote);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
