package entity;

import java.util.*;

/**
 * Manger to manage and prepare (hard code) company set
 * @date 23.07.2014
 * @author M
 */
public class CompanyManager {
   
    private List<Company> companes;
    
    /**
     * Default constructor
     */
    public CompanyManager(){
        companes = new ArrayList<Company>();
        Date day = new Date();
        
        companes.add(new Company("Cat Coal Company", "CCC", CompanyType.ENERGETIC.toString(), 20.0, 11.1, day));
        companes.add(new Company("Cat Com Dot Com", "CCDC", CompanyType.INFORMATIC.toString(), 90.0, 3.4, day));
        companes.add(new Company("Cat coal company", "CCC", CompanyType.ENTERTAINMENT.toString(), 15.0, -11.7, day));
    }

    public List<Company> getCompanes() {
        return companes;
    }

    public void setCompanes(List<Company> companes) {
        this.companes = companes;
    }
    
}
