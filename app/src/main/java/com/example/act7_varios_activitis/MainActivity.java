package com.example.act7_varios_activitis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtén referencias a los botones en el diseño
        Button btnVolumen = findViewById(R.id.btnVOL);
        Button btnCuadrado = findViewById(R.id.btnCUA);
        Button btnTriangulo = findViewById(R.id.btnTRI);
        Button btnConversor = findViewById(R.id.btnCONV);
        Button btnRombo = findViewById(R.id.btnROM);

        // Asigna un listener al botón Volumen
        btnVolumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarNuevaActividad(EsferaActivity.class);
            }
        });

        btnCuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarNuevaActividad(CuadradoActivity.class);
            }
        });

        btnTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarNuevaActividad(TrianguloActivity.class);
            }
        });

        // Asigna un listener al botón Conversor
        btnConversor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarNuevaActividad(ConversorActivity.class);
            }
        });

        // Asigna un listener al botón Rombo
        btnRombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarNuevaActividad(RomboActivity.class);
            }
        });
    }

    private void iniciarNuevaActividad(Class<?> cls) {
        Intent intent = new Intent(MainActivity.this, cls);
        startActivity(intent);
    }
}
