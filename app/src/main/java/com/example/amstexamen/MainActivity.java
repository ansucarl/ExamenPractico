package com.example.amstexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnEmpezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Boton que empieza el juego
        btnEmpezar = (Button) findViewById(R.id.BotonEmpezar);
    }

    public void Juego(View view) {
        Intent intent = new Intent(this, TriviaMagica.class);startActivity(intent);
    }
}