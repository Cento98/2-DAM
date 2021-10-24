package com.example.recyclerviewcountries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Country[] paises;
    private RecyclerView rvReciclador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountryParser paisesParser=new CountryParser(this);
        rvReciclador=findViewById(R.id.rvReciclador);
        if(paisesParser.parse()){
            paises=paisesParser.getCountries();
            CountryAdapter adaptador=new CountryAdapter(paises);
            rvReciclador.hasFixedSize();
            rvReciclador.setAdapter(adaptador);
            rvReciclador.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        }
    }
}