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

import com.movil.proapp.Models.Episode;
import com.movil.proapp.Models.Pest;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PestAdapter extends ArrayAdapter<Pest> {

    private Context context;
    private List<Pest> Pest;

    public PestAdapter(@NonNull Context context, int resource, @NonNull List<Pest> objects) {
        super(context, resource, objects);
        this.context=context;
        this.Pest=objects;
    }
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=layoutInflater.inflate(R.layout.activity_pest_adapter,parent,false);

        ImageView txtImg=(ImageView)rowView.findViewById(R.id.Img);
        Picasso.get().load(Pest.get(position).getImage()).into(txtImg);

        TextView txtName=(TextView)rowView.findViewById(R.id.Name);
        txtName.setText(String.format("Nombre: %s",Pest.get(position).getName()));

        TextView txtDate=(TextView)rowView.findViewById(R.id.Season);
        txtDate.setText(String.format("Temporada: %s",Pest.get(position).getSeason()));

        return rowView;
    }

}