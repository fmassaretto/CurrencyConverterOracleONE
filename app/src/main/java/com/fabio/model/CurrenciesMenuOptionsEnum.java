package com.fabio.model;

public enum CurrenciesMenuOptionsEnum {
    USD_TO_BRL("USD", "Dólar americano", "BRL", "Real brasileiro"),
    ARS_TO_USD("ARS", "Peso argentino", "USD", "Dólar americano"),
    USD_TO_ARS("USD", "Dólar americano", "ARS", "Peso argentino"),
    BRL_TO_USD("BRL", "Real brasileiro", "USD", "Dólar americano"),
    EXIT(null, null ,null, null)
    ;

    private final String fromCurrencySymbol;
    private final String toCurrencySymbol;
    private final String fromCurrencyDesc;
    private final String toCurrencyDesc;

    CurrenciesMenuOptionsEnum(String fromCurrencySymbol, String fromCurrencyDesc, String toCurrencySymbol, String toCurrencyDesc) {
        this.fromCurrencySymbol = fromCurrencySymbol;
        this.fromCurrencyDesc = fromCurrencyDesc;
        this.toCurrencySymbol = toCurrencySymbol;
        this.toCurrencyDesc = toCurrencyDesc;
    }

    public String getFromCurrencySymbol() {
        return fromCurrencySymbol;
    }

    public String getToCurrencySymbol() {
        return toCurrencySymbol;
    }

    public String getFromCurrencyDesc() {
        return fromCurrencyDesc;
    }

    public String getToCurrencyDesc() {
        return toCurrencyDesc;
    }
}
