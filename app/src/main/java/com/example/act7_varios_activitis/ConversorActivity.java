package com.example.act7_varios_activitis;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConversorActivity extends AppCompatActivity {

    private EditText etKilometros;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);

        etKilometros = findViewById(R.id.etKilometros);
        tvResultado = findViewById(R.id.tvResultado);
        Button btnConvertir = findViewById(R.id.btnConvertir);
        Button btnRegresar = findViewById(R.id.btnRegresar);

        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertirMillas();
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra la actividad actual y vuelve a la anterior
            }
        });
    }

    private void convertirMillas() {
        String kilometrosStr = etKilometros.getText().toString().trim();

        if (!kilometrosStr.isEmpty()) {
            double kilometros = Double.parseDouble(kilometrosStr);
            double millas = kilometros * 0.621371;

            // Mostrar el resultado en el TextView
            String resultado = String.format("%.2f", millas) + " millas";
            tvResultado.setText(resultado);
        } else {
            tvResultado.setText("Por favor, ingrese la cantidad en kilómetros.");
        }
    }
}
