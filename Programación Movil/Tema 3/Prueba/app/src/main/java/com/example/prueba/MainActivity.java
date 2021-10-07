package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvSaludo =findViewById(R.id.tvSaludo);
        tvSaludo.setText("German");

        Button bSaludo=findViewById(R.id.bSaludo);
        Button bCuenta=findViewById(R.id.bCuenta);

        View.OnClickListener myButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<100000; i++){
                    tvSaludo.setText(String.valueOf(i));
                }
            }
        };

        bSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSaludo.setText("Caralho");
                Toast.makeText(MainActivity.this, "Buenardo", Toast.LENGTH_SHORT).show();
            }
        });

        bCuenta.setOnClickListener(myButtonListener);








    }



}