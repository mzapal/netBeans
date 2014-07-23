/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author M
 */
public class CompanyManagerTest {
    
    public CompanyManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    /**
     * Test of getCompanies method, of class CompanyManager.
     */
    @Test
    public void testGetCompanies() {
        System.out.println("getCompanies");
        CompanyManager instance = new CompanyManager();
        int expResultSize = 3;
        int resultSize = instance.getCompanies().size();
        assertEquals(resultSize, expResultSize);
    }   
}
