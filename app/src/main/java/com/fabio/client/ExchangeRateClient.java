package com.fabio.client;

import com.fabio.model.ExchangeRate;

import java.io.IOException;
import java.net.URISyntaxException;

public interface ExchangeRateClient {
    ExchangeRate getExchangeRate(String currency) throws URISyntaxException, IOException, InterruptedException;
}
