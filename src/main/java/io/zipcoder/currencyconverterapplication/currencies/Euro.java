package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    private CurrencyType euro = CurrencyType.EURO;



    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/euro.getRate() ;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return euro;
    }
}
