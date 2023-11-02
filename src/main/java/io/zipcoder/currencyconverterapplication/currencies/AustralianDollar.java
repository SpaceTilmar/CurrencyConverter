package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    private CurrencyType australianDollar = CurrencyType.AUSTRALIAN_DOLLAR;



    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/australianDollar.getRate() ;
    }

    @Override
    public CurrencyType getCurrencyType() {
        return australianDollar;
    }
}
