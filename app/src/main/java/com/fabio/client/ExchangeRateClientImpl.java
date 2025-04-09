package com.fabio.client;

import com.fabio.model.ExchangeRate;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateClientImpl implements ExchangeRateClient {
    private final Gson gson = new Gson();

    @Override
    public ExchangeRate getExchangeRate(String currency) throws URISyntaxException, IOException, InterruptedException {
        var url = "https://v6.exchangerate-api.com/v6/29206e31240c027e2a812828/latest/" + currency;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        return gson.fromJson(response.body(), ExchangeRate.class);
    }
}
