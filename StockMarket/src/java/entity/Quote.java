package entity;

import java.util.Date;

/**
 * @date 23.07.2014
 * @author M
 */

class Quote {

    private double price;
    private Date day;
    private double priceChange;
    private Company company;
    
        /*
        Constructor with basic parameters
        @param price - quote price
        @param day - day of quote price
        @param priceChange - price change in quote
        @param company - company object
    */
    Quote(double price, Date day, double priceChange, Company company) {
        this.price = price;
        this.day = day;
        this.priceChange = priceChange;
        this.company = company;
                
    }

    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDay() {
        return this.day;
    }
    
    public void setDay(Date day) {
        this.day = day;
    }

    public double getPriceChange() {
        return this.priceChange;
    }
    
    public void setPriceChange(double priceChange) {
        this.priceChange = priceChange;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    
    
}
