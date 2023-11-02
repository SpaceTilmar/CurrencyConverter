package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    private CurrencyType usDollar= CurrencyType.US_DOLLAR;



    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/usDollar.getRate() ;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return usDollar;
    }
}
