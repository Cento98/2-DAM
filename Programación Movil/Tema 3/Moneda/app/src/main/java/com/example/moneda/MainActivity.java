package com.example.moneda;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView moneda=findViewById(R.id.img);
        Button creu=findViewById(R.id.creu);
        Button cara=findViewById(R.id.cara);

        creu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(moneda()){
                    moneda.setImageResource(R.drawable.euro_cara);
                    Toast.makeText(MainActivity.this, "Has perdido!", Toast.LENGTH_SHORT).show();
                }
                else{
                    moneda.setImageResource(R.drawable.euro_cruz);
                    Toast.makeText(MainActivity.this, "Has ganado!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(moneda()){
                    moneda.setImageResource(R.drawable.euro_cara);
                    Toast.makeText(MainActivity.this, "Has ganado!", Toast.LENGTH_SHORT).show();
                }
                else{
                    moneda.setImageResource(R.drawable.euro_cruz);
                    Toast.makeText(MainActivity.this, "Has perdido!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public boolean moneda(){
        Random random=new Random();
        int compro=random.nextInt(2);
        if(compro==0){
            return false;
        }
        else{
            return true;
        }
    }


}