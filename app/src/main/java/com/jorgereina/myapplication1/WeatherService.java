package com.jorgereina.myapplication1;

import com.jorgereina.myapplication1.objects.Periods;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherService {

    // http://api.aerisapi.com/forecasts/11101?client_id=i5pHKBD39KOmHRkLoHcSi&client_secret=zjEUHJhnSKZR7yxrfXOU5QtFo3XGiyDjErG59s9M
    @GET("forecasts/11101?client_id=i5pHKBD39KOmHRkLoHcSi&client_secret=zjEUHJhnSKZR7yxrfXOU5QtFo3XGiyDjErG59s9M")
    Call<Periods> listPeriods();


}
