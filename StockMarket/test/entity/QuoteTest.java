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
    
    private Quote quote;
    private Company company;
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
        company = new Company("Test company", "TC", CompanyType.ENERGETIC.toString());
        quote = new Quote(24.55, new Date(36000), -2.4, company);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getPrice method, of class Quote.
     */
    @Test
    public void testGetPrice() {
      assertEquals(24.55,quote.getPrice());
    }

    /**
     * Test of setPrice method, of class Quote.
     */
    @Test
    public void testSetPrice() {
      quote.setPrice(56.0);
      assertEquals(56.0, quote.getPrice());  
    }

    /**
     * Test of getDay method, of class Quote.
     */
    @Test
    public void testGetDay() {
        assertEquals(new Date(36000), quote.getDay());
    }

    /**
     * Test of setDay method, of class Quote.
     */
    @Test
    public void testSetDay() {
        quote.setDay(new Date(72000));
        assertEquals(new Date(72000), quote.getDay());
    }

    /**
     * Test of getPriceChange method, of class Quote.
     */
    @Test
    public void testGetPriceChange() {
        assertEquals(-2.4, quote.getPriceChange());
    }

    /**
     * Test of setPriceChange method, of class Quote.
     */
    @Test
    public void testSetPriceChange() {
        quote.setPriceChange(2.5);
        assertEquals(2.5, quote.getPriceChange());
    }

    /**
     * Test of getCompany method, of class Quote.
     */
    @Test
    public void testGetCompany() {
        assertEquals(company, quote.getCompany());
    }

    /**
     * Test of setCompany method, of class Quote.
     */
    @Test
    public void testSetCompany() {
        Company newCompany = new Company("New Company", "NC", CompanyType.INFORMATIC.toString());
        quote.setCompany(newCompany);
        assertEquals(newCompany, quote.getCompany());
    }
    
}
