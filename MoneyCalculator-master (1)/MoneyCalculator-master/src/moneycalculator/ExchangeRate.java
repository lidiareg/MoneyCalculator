package moneycalculator;
import Model.Number;

public class ExchangeRate {
    private String actualCurrency;
    private String fromCurrency;
    private Number rate;
    
    public ExchangeRate(String actualCurrency, float rate, String fromCurrency) {
        this.actualCurrency = actualCurrency;
        this.fromCurrency = fromCurrency;
        this.rate = new Number(rate);
    }
    
    public ExchangeRate(String actualCurrency, Number rate, String fromCurrency) {
        this.actualCurrency = actualCurrency;
        this.fromCurrency = fromCurrency;
        this.rate = rate;
    }

    public String getActualCurrency() {
        return actualCurrency;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public Number getRate() {
        return rate;
    }
    
}
