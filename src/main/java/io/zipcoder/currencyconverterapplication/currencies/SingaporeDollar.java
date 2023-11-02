package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    private CurrencyType singaporeDollar= CurrencyType.SINGAPORE_DOLLAR;



    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/singaporeDollar.getRate() ;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return singaporeDollar;
    }
}
