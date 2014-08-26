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
        
        Date yesterday = new Date(day.getTime() - 86400000);
        companies.get(0).getQuotes().add(0, new Quote(18, yesterday, 4.0, companies.get(0)));
        companies.get(1).getQuotes().add(0, new Quote(87, yesterday, -2.0, companies.get(1)));
        companies.get(2).getQuotes().add(0, new Quote(17, yesterday, 10.0, companies.get(2)));
    }

    public List<Company> getCompanies() {
        return this.companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
    
}
