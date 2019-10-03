package com.jgm.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Asocia un layout a la actividad
        setContentView(R.layout.activity_main);

        //vincular las vistas con los objetos de la clase
        texto = findViewById(R.id.textView);
        boton = findViewById(R.id.button);




        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.game_over);
            }
        });

    }
}
