package entity;

import java.util.*;

/**
 * Manger to manage and prepare (hard code) company set
 * @data 23.07.2014
 * @author M
 */
public class CompanyManager {
   
    private List<Company> companies;
    
    /**
     * Default constructor
     */
    public CompanyManager(){
        companies = new ArrayList<Company>();
        Date day = new Date();
        
        companies.add(new Company("Cat Coal Company", "CCC", CompanyType.ENERGETIC.toString(), 20.0, 11.1, day));
        companies.add(new Company("Cat Com Dot Com", "CCDC", CompanyType.INFORMATIC.toString(), 90.0, 3.4, day));
        companies.add(new Company("Cat coal company", "CCC", CompanyType.ENTERTAINMENT.toString(), 15.0, -11.7, day));
    }

    public List<Company> getCompanies() {
        return this.companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
    
}
