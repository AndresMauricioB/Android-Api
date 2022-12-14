package com.movil.proapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.movil.proapp.ApiManager.Apis;
import com.movil.proapp.ApiManager.PersonaService;
import com.movil.proapp.Models.Episode;
import com.movil.proapp.Models.Personaje;
import com.movil.proapp.Models.Pest;
import com.movil.proapp.Models.Store;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    PersonaService personaService;
    PersonaService personaService1;
    List<Personaje> listPersona=new ArrayList<>();
    ListView listView;

    List<Episode> listEpisodes=new ArrayList<>();
    List<Store> listStores=new ArrayList<>();
    List<Pest> listPest=new ArrayList<>();

    Button btnPer, btnEpi, btnStor, btnPes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        listPersons();

        btnPer = (Button) findViewById(R.id.btnPersonaje);
        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listPersons();
            }
        });
        btnEpi = (Button) findViewById(R.id.btnEpisode);
        btnEpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listEpisodes();
            }
        });
        btnStor = (Button) findViewById(R.id.btnStore);
        btnStor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listStores();
            }
        });

        btnPes = (Button) findViewById(R.id.btnPest);
        btnPes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listPest();
            }
        });
    }

    private void listPest() {
        personaService= Apis.getPersonaService();
        Call<List<Pest>> call=personaService.getPest();
        call.enqueue(new Callback<List<Pest>>() {
            @Override
            public void onResponse(Call<List<Pest>> call, Response<List<Pest>> response) {
                if(response.isSuccessful()) {
                    listPest = response.body();
                    listView.setAdapter(new PestAdapter(MainActivity.this,R.layout.activity_pest_adapter,listPest));
                }
            }
            @Override
            public void onFailure(Call<List<Pest>> call, Throwable t) {
                Log.e("Error:",t.getMessage());
            }
        });
    }

    public void listPersons(){
        personaService= Apis.getPersonaService();
        Call<List<Personaje>> call=personaService.getPersonajes();
        call.enqueue(new Callback<List<Personaje>>() {
            @Override
            public void onResponse(Call<List<Personaje>> call, Response<List<Personaje>> response) {
                if(response.isSuccessful()) {
                    listPersona = response.body();
                    listView.setAdapter(new PersonaAdapter(MainActivity.this,R.layout.activity_persona_adapter,listPersona));
                }
            }
            @Override
            public void onFailure(Call<List<Personaje>> call, Throwable t) {
                Log.e("Error:",t.getMessage());
            }
        });
    }

    public void listEpisodes(){
        personaService1= Apis.getPersonaService();
        Call<List<Episode>> call=personaService1.getEpisodes();
        call.enqueue(new Callback<List<Episode>>() {
            @Override
            public void onResponse(Call<List<Episode>> call, Response<List<Episode>> response) {
                if(response.isSuccessful()){
                    listEpisodes = response.body();
                    listView.setAdapter(new EpisodesAdapter(MainActivity.this,R.layout.activity_episodes_adapter,listEpisodes));
                }
            }
            @Override
            public void onFailure(Call<List<Episode>> call, Throwable t) {
                Log.e("Error:",t.getMessage());
            }
        });
    }

    public void listStores(){
        personaService1= Apis.getPersonaService();
        Call<List<Store>> call=personaService1.getStores();
        call.enqueue(new Callback<List<Store>>() {
            @Override
            public void onResponse(Call<List<Store>> call, Response<List<Store>> response) {
                if(response.isSuccessful()){
                    listStores = response.body();
                    listView.setAdapter(new StoreAdapter(MainActivity.this,R.layout.activity_store_adapter,listStores));
                }
            }
            @Override
            public void onFailure(Call<List<Store>> call, Throwable t) {
                Log.e("Error:",t.getMessage());
            }
        });
    }


}