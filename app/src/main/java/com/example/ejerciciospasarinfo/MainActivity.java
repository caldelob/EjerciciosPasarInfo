package com.example.ejerciciospasarinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button btnPalabras;
    private Button tbnCaracteres;
    private Text ptEscribir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();
        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int numDePalabras = ptEscribir.getTextContent().split("").length;
                int numDeCaracteres = ptEscribir.getTextContent().length();

                Intent intent = new Intent(MainActivity.this, DescifrarCantidad.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable(String.valueOf(numDeCaracteres), numDePalabras);
                intent.putExtras(bundle);
                startActivity(intent);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });



    }

    @SuppressLint("WrongViewCast")
    private void inicializar() {
        btnPalabras = findViewById(R.id.btnPalabrasMain);
        tbnCaracteres = findViewById(R.id.btnCaracteresMain);
        ptEscribir = findViewById(R.id.ptEscribirMain);


       btnPalabras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(ptEscribir.getWholeText()!=null){
                    int numDePalabras = ptEscribir.getTextContent().split("").length;
                }
            }
        });
        tbnCaracteres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(ptEscribir.getWholeText()!=null){
                    int numDeCaracteres = ptEscribir.getTextContent().length();


                }
            }
        });
    }
}