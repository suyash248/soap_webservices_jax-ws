package com.soni;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

public class CurrencyConverterMain {
	public static void main(String[] args) {
		CurrencyConvertor currencyConverter = new CurrencyConvertor();
		CurrencyConvertorSoap currencyConverterSoap = currencyConverter.getCurrencyConvertorSoap();
		double conversionRate = currencyConverterSoap.conversionRate(Currency.USD, Currency.INR);
		System.out.println("USD 1 = INR "+conversionRate);
	}
}
