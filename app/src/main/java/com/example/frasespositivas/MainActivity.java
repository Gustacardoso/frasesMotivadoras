package com.example.frasespositivas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gerandoFrase(View view){
         String [] frases = {
                 "\"No que diz respeito ao empenho, ao compromisso," +
                         " ao esforço, à dedicação, não existe meio termo. Ou você faz uma coisa bem feita " +
                         "ou não faz.\""+
                 "\n Ayrton Senna",
                  "\"O medo me fascina.\""+
                 "\n Ayrton Senna",
                 "\"Se você quer ser bem sucedido, precisa ter dedicação total, buscar seu último limite e dar o melhor de si.\""+
                  "\n Ayrton Senna",
                 "\"O medo faz parte da vida da gente. Algumas pessoas não sabem como enfrentá-lo, outras - acho que estou entre elas - aprendem a conviver com ele e o encaram não como uma coisa negativa, mas como um sentimento de autopreservação.\""+
                         "\n Ayton Senna"

         };

         int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textViewId);
        texto.setText(frases[numero]);
    }
}
