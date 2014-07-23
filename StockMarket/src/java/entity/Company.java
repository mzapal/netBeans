package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @data 23.07.2014
 * @author M
 */
public class Company {
    private String name;
    private String symbol;
    private String sector;
    private List<Quote> quotes;
    private Quote lastQuote;
    
    /*
        Default constructor
    */
    public Company(){
    };
    
    /*
        Constructor with basic parameters
        @param name - name of company
        @param symbol - comapny symbol
        @param sector - sector in which company is working
    */
    public Company(String name, String symbol, String sector){
        this.name = name;
        this.symbol = symbol;
        this.sector = sector;        
    }
    
    /*
        Constructor with extended parameters
        @param name - name of company
        @param symbol - comapny symbol
        @param sector - sector in which company is working
        @param price - current company stock price
        @param priceChange - price change of current company
        @param day - day of price change
    */
    public Company(String name, String symbol, String sector, double price, double priceChange, Date day){
        this(name,symbol,sector);
        this.quotes = new ArrayList <Quote> ();
        this.quotes.add(new Quote(price, day, priceChange, this));
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSector() {
        return this.sector;
    }
    
    public void setSector(String sector) {
        this.sector = sector;
    }
    
    public List<Quote> getQuotes() {
        return this.quotes;
    }
    
    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public Quote getLastQuote() {
        if (this.lastQuote == null)
            if (this.getQuotes() != null && !this.getQuotes().isEmpty())
                this.lastQuote = this.getQuotes().get(this.getQuotes().size() - 1);
        return this.lastQuote;
    }

    public void setLastQuote(Quote lastQuote) {
        this.lastQuote = lastQuote;
    }
    
    
    
    
}
