package com.movil.proapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.content.Context;
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

public class PersonaAdapter extends ArrayAdapter<Personaje> {

    private Context context;
    private List<Personaje> personajes;

    public PersonaAdapter(@NonNull Context context, int resource, @NonNull List<Personaje> objects) {
        super(context, resource, objects);
        this.context=context;
        this.personajes=objects;
    }
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=layoutInflater.inflate(R.layout.activity_persona_adapter,parent,false);
        ImageView txtImg=(ImageView)rowView.findViewById(R.id.Img);
        Picasso.get().load(personajes.get(position).getImage()).into(txtImg);
        TextView txtName=(TextView)rowView.findViewById(R.id.Name);
        txtName.setText(String.format("Nombre: %s",personajes.get(position).getName()));
        TextView txtGender=(TextView)rowView.findViewById(R.id.Gender);
        txtGender.setText(String.format("Genero: %s",personajes.get(position).getGender()));
        TextView txtOccupation=(TextView)rowView.findViewById(R.id.Occupation);
        txtOccupation.setText(String.format("Ocupacion: %s",personajes.get(position).getOccupation()));
        return rowView;
    }
}