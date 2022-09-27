package com.example.ejerciciospasarinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class DescifrarCantidad extends AppCompatActivity {

    private Number numPalabras;
    private Number numCaracteres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descifrar_cantidad);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        if (bundle != null) {

            Toast.makeText(this, numPalabras.intValue(), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, numCaracteres.intValue(), Toast.LENGTH_SHORT).show();


        }
    }


}