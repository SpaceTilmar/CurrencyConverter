package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    private CurrencyType chineseYR= CurrencyType.CHINESE_YR;



    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/chineseYR.getRate() ;
    }
    @Override
    public CurrencyType getCurrencyType() {
        return chineseYR;
    }
}
