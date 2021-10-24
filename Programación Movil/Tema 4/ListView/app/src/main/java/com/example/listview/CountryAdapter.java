package com.example.listview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Locale;

public class CountryAdapter extends ArrayAdapter<Country> {

    private Country[] paises;

    public CountryAdapter(@NonNull Context context, Country[] paises) {
        super(context, R.layout.listitem_country, paises);
        this.paises=paises;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflador=LayoutInflater.from(getContext());
        View item = inflador.inflate(R.layout.listitem_country, null);

        ImageView ivBanderas=item.findViewById(R.id.ivBandera);
        String codigo=paises[position].getCode().toLowerCase(Locale.ROOT);
        //ivBanderas.setImageResource(getResources().getDrawable(getResouces().getIdentifier("drawable/"+codigo, "drawable",getPackageName())));
        //ivBanderas.setImageBitmap(BitmapFactory.decodeFile("_"+codigo));
        int idImagen = getContext().getResources().getIdentifier("_"+codigo,"drawable", getContext().getPackageName());
        if(idImagen != 0)
            ivBanderas.setImageResource(idImagen);
        else
            ivBanderas.setImageResource(R.drawable._onu);
        TextView nombre=item.findViewById(R.id.tvNombre);
        nombre.setText(paises[position].getNombre());

        TextView capital=item.findViewById(R.id.tvCapital);
        capital.setText(paises[position].getCapital());

        TextView poblacion=item.findViewById(R.id.tvPoblacion);
        poblacion.setText(paises[position].getPoblacion());

        return item;
    }
}
