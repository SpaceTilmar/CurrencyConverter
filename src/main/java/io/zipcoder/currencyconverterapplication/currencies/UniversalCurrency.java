package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    private CurrencyType universalCurrency= CurrencyType.UNIVERSAL_CURRENCY;



    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/universalCurrency.getRate() ;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return universalCurrency;
    }
}
