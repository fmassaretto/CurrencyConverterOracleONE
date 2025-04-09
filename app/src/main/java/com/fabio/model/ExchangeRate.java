package com.fabio.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import jakarta.validation.Valid;
import lombok.Data;

import java.util.Map;

@Data
public class ExchangeRate {

    @SerializedName("result")
    @Expose
    public String result;
    @SerializedName("documentation")
    @Expose
    public String documentation;
    @SerializedName("terms_of_use")
    @Expose
    public String termsOfUse;
    @SerializedName("time_last_update_unix")
    @Expose
    public Integer timeLastUpdateUnix;
    @SerializedName("time_last_update_utc")
    @Expose
    public String timeLastUpdateUtc;
    @SerializedName("time_next_update_unix")
    @Expose
    public Integer timeNextUpdateUnix;
    @SerializedName("time_next_update_utc")
    @Expose
    public String timeNextUpdateUtc;
    @SerializedName("base_code")
    @Expose
    public String baseCode;
    @SerializedName("conversion_rates")
    @Expose
    @Valid
    public Map<String, Double> conversionRates;

}
