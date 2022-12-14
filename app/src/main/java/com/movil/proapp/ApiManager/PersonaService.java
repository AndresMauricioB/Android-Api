package com.movil.proapp.ApiManager;

import com.movil.proapp.Models.Episode;
import com.movil.proapp.Models.Personaje;
import com.movil.proapp.Models.Pest;
import com.movil.proapp.Models.Store;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PersonaService {
    /* @Headers({"application-type: application/json",
    "Content-Type: application/json"})*/

    @GET("characters?limit=20")
    Call<List<Personaje>> getPersonajes();

    @GET("episodes?limit=20")
    Call<List<Episode>> getEpisodes();

    @GET("storeNextDoor?limit=20")
    Call<List<Store>> getStores();

    @GET("pestControlTruck?limit=20&skip=14")
    Call<List<Pest>> getPest();
}
