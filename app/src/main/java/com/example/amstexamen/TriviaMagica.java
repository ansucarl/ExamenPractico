package com.example.amstexamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TriviaMagica extends AppCompatActivity {

    private Pregunta [] preguntas = new Pregunta[5];
    private int preguntaActual = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia_magica);

        preguntas[0] = new Pregunta("¿Cuántas veces Arnold Schwarzenegger ha interpretado al Terminator T800?", "5", "6", "4", "3", "6");
        preguntas[1] = new Pregunta("¿En qué película de la Saga de Star Wars la princesa Leia empieza a usar la fuerza?", "Episodio V", "Episodio VII", "Episodio VI", "Episodio IV", "Episodio VI");
        preguntas[2] = new Pregunta("¿Qué película de Pedro Almodóvar ha ganado un Oscar?", "Todo sobre mi madre", "Volver", "Dolor y gloria", "Tacones lejanos", "Todo sobre mi madre");
        preguntas[3] = new Pregunta("¿Qué año es?", "2019", "2018", "2017", "2017", "1");
        preguntas[4] = new Pregunta("¿Qué año es?", "2019", "2018", "2017", "2017", "1");

        public class Pregunta {
            private String texto;
            private String[] respuestas = new String[3];
            private String correcta;

            // Constructor para facilitar crear las preguntas
            public Pregunta(String texto, String r1, String r2, String r3, String r4, String rcorrecta) {
                this.texto = texto;
                this.respuestas[0] = r1;
                this.respuestas[1] = r2;
                this.respuestas[2] = r3;
                this.respuestas[3] = r4;
                this.correcta = rcorrecta;
            }
            // Falta agregar los Getters & Setters

        }
    }
}