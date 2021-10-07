package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numeroIntroducido=findViewById(R.id.entrada);
        Button calcular=findViewById(R.id.calcular);
        TextView numero=findViewById(R.id.numero);


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long aux=1;
                long introduccion=Integer.parseInt(numeroIntroducido.getText().toString());
                for(int i=1;i<introduccion;i++){
                    aux=aux*i;
                }
                numero.setText(String.valueOf(aux));
            }
        });
    }
}