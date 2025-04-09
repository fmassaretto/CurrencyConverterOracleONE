package com.fabio.service;

import com.fabio.client.ExchangeRateClient;
import com.fabio.model.ExchangeRate;

import java.io.IOException;
import java.net.URISyntaxException;

public class ExchangeRateService {

    private final ExchangeRateClient exchangeRateClient;

    public ExchangeRateService(ExchangeRateClient exchangeRateClient) {
        this.exchangeRateClient = exchangeRateClient;
    }

    public ExchangeRate getExchangeRateObject(String fromCurrency) throws URISyntaxException, IOException, InterruptedException {
        return exchangeRateClient.getExchangeRate(fromCurrency);
    }

    public double getCalculatedExchangeValue(double fromCurrencyValue, String fromCurrency, String toCurrency) {
        ExchangeRate exchangeRate = null;

        try {
            exchangeRate = getExchangeRateObject(fromCurrency.toUpperCase());

            if (exchangeRate == null || !exchangeRate.result.equalsIgnoreCase("success")) {
                throw new RuntimeException("Cannot convert " + fromCurrency + " to " + toCurrency);
            }

            double toCurrencyValue = exchangeRate.conversionRates.get(toCurrency.toUpperCase());

            return fromCurrencyValue * toCurrencyValue;
        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException("Error when trying to access the exchange API with message: " + e.getMessage());
        }
    }
}
