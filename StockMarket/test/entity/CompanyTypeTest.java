/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @date 23.07.2014
 * @author M
 */
public class CompanyTypeTest {
    private static String ENERGETIC = "Energetic";
    private static String INFORMATIC = "Informatic";
    private static String ENTERTAINMENT = "Entertainment";
    public CompanyTypeTest() {
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
     * Test of values method, of class CompanyType.
     */
    @Test
    public void testValues() {
        assertEquals(3, CompanyType.values().length);
    }

    /**
     * Test of valueOf method, of class CompanyType.
     */
    @Test
    public void testValueOf() {
        assertEquals(CompanyType.ENERGETIC, CompanyType.valueOf("ENERGETIC"));
        assertEquals(CompanyType.ENTERTAINMENT, CompanyType.valueOf("ENTERTAINMENT"));
        assertEquals(CompanyType.INFORMATIC, CompanyType.valueOf("INFORMATIC"));
    }

    /**
     * Test of toString method, of class CompanyType.
     */
    @Test
    public void testToString() {
        assertEquals(ENERGETIC, CompanyType.ENERGETIC.toString());
        assertEquals(ENTERTAINMENT, CompanyType.ENTERTAINMENT.toString());
        assertEquals(INFORMATIC, CompanyType.INFORMATIC.toString());
    }
    
}
