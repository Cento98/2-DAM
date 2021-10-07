package com.example.piedrapapeltijeras;

import androidx.appcompat.app.AppCompatActivity;

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

        Button bPiedra=findViewById(R.id.piedra);
        Button bPapel=findViewById(R.id.papel);
        Button bTijeras=findViewById(R.id.tijeras);
        ImageView eMaquina=findViewById(R.id.maquina);
        ImageView eJugador=findViewById(R.id.jugador);

        bPiedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eJugador.setImageResource(R.drawable.piedra);
                int eleccionM=tiradaMaquina();
                switch(eleccionM){
                    case 2:
                        eMaquina.setImageResource(R.drawable.papel);
                        Toast.makeText(MainActivity.this, "La maquina gana!", Toast.LENGTH_SHORT).show();
                    break;
                    case 3:
                        eMaquina.setImageResource(R.drawable.tijeras);
                        Toast.makeText(MainActivity.this, "Has ganado!", Toast.LENGTH_SHORT).show();
                    break;
                    default:
                        eMaquina.setImageResource(R.drawable.piedra);
                        Toast.makeText(MainActivity.this, "Empatais!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eJugador.setImageResource(R.drawable.papel);
                int eleccionM=tiradaMaquina();
                switch(eleccionM){
                    case 1:
                        eMaquina.setImageResource(R.drawable.piedra);
                        Toast.makeText(MainActivity.this, "Has ganado!", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        eMaquina.setImageResource(R.drawable.tijeras);
                        Toast.makeText(MainActivity.this, "La maquina ha ganado!", Toast.LENGTH_SHORT).show();
                        break;
                    default:                        eMaquina.setImageResource(R.drawable.papel);
                        Toast.makeText(MainActivity.this, "Empatais!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bTijeras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eJugador.setImageResource(R.drawable.tijeras);
                int eleccionM=tiradaMaquina();
                switch(eleccionM){
                    case 1:
                        eMaquina.setImageResource(R.drawable.piedra);
                        Toast.makeText(MainActivity.this, "La maquina gana!", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        eMaquina.setImageResource(R.drawable.papel);
                        Toast.makeText(MainActivity.this, "Has ganado!", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        eMaquina.setImageResource(R.drawable.tijeras);
                        Toast.makeText(MainActivity.this, "Empatais!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public int tiradaMaquina(){
        Random random=new Random();
        int aleat=random.nextInt(3-1+1)+1;
        return aleat;
    }
}