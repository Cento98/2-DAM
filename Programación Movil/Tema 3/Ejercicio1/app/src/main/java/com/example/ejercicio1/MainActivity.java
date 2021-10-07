package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button saludar=findViewById(R.id.Boton);
        EditText nombre=findViewById(R.id.Nombre);
        EditText apellidos=findViewById(R.id.Apellidos);

        saludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, nombre.getText()+" "+apellidos.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}