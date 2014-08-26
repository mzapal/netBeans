package entity;

import java.util.*;

/**
 *
 * @author M
 */
public class SectorInfo {
   private CompanyManager companyManager;
   private Map<String, Double> prices;
   
   public CompanyManager getCompanyManger(){
       return companyManager;
   }
   
   public void setCompanyManager(CompanyManager companyManager){
       this.companyManager = companyManager;
   }
   
   public Map<String, Double> getPrices(){
       prices = new HashMap<>();
       for(Company company: this.getCompanyManger().getCompanies()){
           Double value = prices.get(company.getSector());
           if(value == null){
               value = 0.0;
           }
           prices.put(company.getSector(), value + company.getLastQuote().getPrice());
       }
       return prices;
   }
   
   public Object[] getSectors(){
       Map<String, Double> sectorMap = this.getPrices();
       return sectorMap.keySet().toArray();
   }
}
