package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @date 23.07.2014
 * @author M
 */
public class CompanyTest {
    private final static String COMPANY_NAME = "Name";
    private final static String COMPANY_SYMBOL = "NM";
    private final static String COMPANY_SECTOR = CompanyType.ENERGETIC.toString();
    private Company instanceNull;
    private Company installFillBasic;
    private Company installFillFull;
    
    public CompanyTest() {
    }
    @BeforeMethod
    public void set(){
        instanceNull  = new Company();
        installFillBasic = new Company(COMPANY_NAME, COMPANY_SYMBOL, COMPANY_SECTOR);
        installFillFull = new Company(COMPANY_NAME, COMPANY_NAME, COMPANY_NAME, 25, 88, new Date());
    }

    @Test
    public void testGetName_Null() {
       assertNull(instanceNull.getName());
    }
    
    @Test
    public void testGetName() {
       assertEquals(installFillBasic.getName(), COMPANY_NAME);
    }

    @Test
    public void testSetName_null() {
        // GIVEN
        instanceNull.setName(null);
        
        // THEN
        assertNull(instanceNull.getName());
    }
    
    @Test
    public void testSetName_NotNull() {
        // GIVEN
        instanceNull.setName(COMPANY_NAME);
        
        // THEN
        assertEquals(instanceNull.getName(), COMPANY_NAME);
    }

    @Test
    public void testGetSymbol_null() {
        assertNull(instanceNull.getSymbol()); 
    }
    
    @Test
    public void testGetSymbol_NotNull() {
        assertEquals(installFillBasic.getSymbol(), COMPANY_SYMBOL);
    }

    @Test
    public void testSetSymbol_null() {
        // GIVEN
        instanceNull.setSymbol(null);
        
        // THEN
        assertNull(instanceNull.getSymbol());
    }
    
    @Test
    public void testSetSymbol_notNull() {
        // GIVEN
        instanceNull.setSymbol(COMPANY_SYMBOL + "25");
        
        // THEN
        assertEquals(instanceNull.getSymbol(), COMPANY_SYMBOL + "25");
    }

    @Test
    public void testGetSector_null() {
       assertNull(instanceNull.getSector());
    }
    
   @Test
    public void testGetSector_NotNull() {
       assertEquals(installFillBasic.getSector(), COMPANY_SECTOR);
    }

    @Test
    public void testSetSector_null() {
        // GIVEN
        installFillBasic.setSector(null);
        
        // THEN
        assertNull(installFillBasic.getSector());
    }
    
    @Test
    public void testSetSector_NotNull() {
        // GIVEN
        instanceNull.setSector(COMPANY_SECTOR + "88");
        
        // THEN
        assertEquals(instanceNull.getSector(), COMPANY_SECTOR + "88");
    }

    @Test
    public void testSetQuotes() {
       // GIVEN
       List<Quote> quotes = new ArrayList<Quote>();
       Quote quote = new Quote(12.1, new Date(), 1.1, installFillBasic);
       quotes.add(quote);
       installFillBasic.setQuotes(quotes);
       // THEN
       assertEquals(1,installFillBasic.getQuotes().size());
       
    }

    @Test
    public void testGetLastQuote() {
       assertNotNull(installFillFull.getLastQuote());
    }

    @Test
    public void testSetLastQuote() {
       // GIVEN
       Quote quote = new Quote(12.1, new Date(), 1.1, installFillBasic);
       installFillBasic.setLastQuote(quote);
       // THEN
       assertNotNull(installFillBasic.getLastQuote());
    }
    
}
