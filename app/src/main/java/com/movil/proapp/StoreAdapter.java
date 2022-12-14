package com.movil.proapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.movil.proapp.Models.Personaje;
import com.movil.proapp.Models.Store;
import com.squareup.picasso.Picasso;

import java.util.List;

public class StoreAdapter extends ArrayAdapter<Store> {

    private Context context;
    private List<Store> Stores;

    public StoreAdapter(@NonNull Context context, int resource, @NonNull List<Store> objects) {
        super(context, resource, objects);
        this.context=context;
        this.Stores=objects;
    }
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=layoutInflater.inflate(R.layout.activity_store_adapter,parent,false);
        ImageView txtImg=(ImageView)rowView.findViewById(R.id.Img);
        Picasso.get().load(Stores.get(position).getImage()).into(txtImg);
        TextView txtName=(TextView)rowView.findViewById(R.id.Name);
        txtName.setText(String.format("Nombre: %s",Stores.get(position).getName()));
        TextView txtGender=(TextView)rowView.findViewById(R.id.Season);
        txtGender.setText(String.format("Temporada: %s",Stores.get(position).getSeason()));
        TextView txtOccupation=(TextView)rowView.findViewById(R.id.Episode);
        txtOccupation.setText(String.format("Episodio: %s",Stores.get(position).getEpisode()));
        return rowView;
    }
}