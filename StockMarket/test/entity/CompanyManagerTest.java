package entity;

import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 * @date 23.07.2014
 * @author M
 */
public class CompanyManagerTest {
    
    public CompanyManagerTest() {
    }

    @Test
    public void testGetCompanies() {
        // GIVEN
        CompanyManager instance = new CompanyManager();
        
        // WHEN
        int expResultSize = 3;
        int resultSize = instance.getCompanies().size();
        
        // THEN
        assertEquals(resultSize, expResultSize);
    }   
    
    @Test
    public void testSetCompanies() {
        // GIVEN
        List companies = new ArrayList<Company>();
        CompanyManager instance = new CompanyManager();

        // WHEN
        int expResultSize = 1;
        companies.add(new Company("Comapny A", "A", CompanyType.ENERGETIC.toString()));
        instance.setCompanies(companies);
        
        // THEN
        assertEquals(expResultSize, instance.getCompanies().size());
    } 
}
