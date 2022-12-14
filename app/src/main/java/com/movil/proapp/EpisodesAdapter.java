package com.movil.proapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.movil.proapp.ApiManager.Apis;
import com.movil.proapp.ApiManager.PersonaService;
import com.movil.proapp.Models.Episode;
import com.movil.proapp.Models.Personaje;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EpisodesAdapter extends ArrayAdapter<Episode> {
    private Context context;
    private List<Episode> Episodes;


    public EpisodesAdapter(@NonNull Context context, int resource, @NonNull List<Episode> objects) {
        super(context, resource, objects);
        this.context=context;
        this.Episodes=objects;
    }
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=layoutInflater.inflate(R.layout.activity_episodes_adapter,parent,false);

        TextView txtName=(TextView)rowView.findViewById(R.id.Name);
        txtName.setText(String.format("Nombre: %s",Episodes.get(position).getName()));

        TextView txtDate=(TextView)rowView.findViewById(R.id.airDate);
        txtDate.setText(String.format("Fecha de estreno: %s",Episodes.get(position).getAirDate()));

        TextView txtViewers=(TextView)rowView.findViewById(R.id.Viewers);
        txtViewers.setText(String.format("Vistas: %s",Episodes.get(position).getTotalViewers()));

        return rowView;
    }
}