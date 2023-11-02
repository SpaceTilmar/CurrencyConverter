package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {
    private CurrencyType ringgit= CurrencyType.RINGGIT;



    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/ringgit.getRate() ;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return ringgit;
    }
}
