package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private Country[] paises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listaPaises=findViewById(R.id.lvLista);
        CountryParser oPaises=new CountryParser(this);
        if(oPaises.parse()) {
            paises = oPaises.getCountries();
            CountryAdapter adaptador = new CountryAdapter(this, paises);
            listaPaises.setAdapter(adaptador);
        }
    }
}