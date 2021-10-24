package com.example.recyclerviewcountries;

import android.location.GnssAntennaInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder>{

    private Country[] paises;

    public CountryAdapter(@NonNull Context context, Country[] paises) {
        super(context, R.layout.item_country, paises);
        this.paises=paises;
    }

    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false);
        return new CountryViewHolder(itemView);
    }
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position){
        Country pais=paises[position];
        holder.bindCountry(pais, position);
    }
    public int getItemCount(){return paises.length;}

    public class CountryViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre;
        private TextView capital;
        private TextView poblacion;
        private ImageView bandera;


        public CountryViewHolder(@NonNull View itemView){
            super(itemView);
            nombre=itemView.findViewById(R.id.tvNombre);
            capital= itemView.findViewById(R.id.tvCapital);
            poblacion=itemView.findViewById(R.id.tvPoblacion);
            bandera=itemView.findViewById(R.id.ivBandera);
        }

        public void bindCountry(Country countri, int i){
            nombre.setText(countri.getNombre());
            capital.setText(countri.getCapital());
            poblacion.setText(countri.getPoblacion());
            String codigo=paises[i].getCode().toLowerCase();
            int idImagen = bandera.getContext().getResources().getIdentifier("_"+codigo,"drawable", bandera.getContext().getPackageName());
            if(idImagen != 0){
                bandera.setImageResource(idImagen);
            }
            else{
                bandera.setImageResource(R.drawable._onu);
            }

        }


    }
}
