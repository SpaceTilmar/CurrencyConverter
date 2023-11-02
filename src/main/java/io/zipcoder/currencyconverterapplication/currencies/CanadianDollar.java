package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    private CurrencyType canadianDollar = CurrencyType.CANADIAN_DOLLAR;



    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/canadianDollar.getRate() ;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return canadianDollar;
    }
}
