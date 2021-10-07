package com.example.pruebatoast;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Creando",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(getClass().getSimpleName(),"onStart");
        Toast.makeText(this,"Empezando",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(getClass().getSimpleName(),"onStop");
        Toast.makeText(this,"Stopeando",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(getClass().getSimpleName(),"onPause");
        Toast.makeText(this,"Pausando",Toast.LENGTH_SHORT).show();
        if(isFinishing()){
            Toast.makeText(this,"Finalizando",Toast.LENGTH_SHORT).show();
        }
    }
}