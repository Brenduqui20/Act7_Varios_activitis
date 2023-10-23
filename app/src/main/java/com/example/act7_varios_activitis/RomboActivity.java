package com.example.act7_varios_activitis;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class RomboActivity extends AppCompatActivity {

    private EditText etDiagonalMayor;
    private EditText etDiagonalMenor;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rombo);

        etDiagonalMayor = findViewById(R.id.etDiagonalMayor);
        etDiagonalMenor = findViewById(R.id.etDiagonalMenor);
        tvResultado = findViewById(R.id.tvResultado);
        Button btnCalcular = findViewById(R.id.btnCalcular);
        Button btnRegresar = findViewById(R.id.btnRegresar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularArea();
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra la actividad actual y vuelve a la anterior
            }
        });
    }

    private void calcularArea() {
        String diagonalMayorStr = etDiagonalMayor.getText().toString().trim();
        String diagonalMenorStr = etDiagonalMenor.getText().toString().trim();

        if (!diagonalMayorStr.isEmpty() && !diagonalMenorStr.isEmpty()) {
            double diagonalMayor = Double.parseDouble(diagonalMayorStr);
            double diagonalMenor = Double.parseDouble(diagonalMenorStr);
            double area = (diagonalMayor * diagonalMenor) / 2;

            // Redondear el resultado a dos decimales
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String resultado = decimalFormat.format(area);

            tvResultado.setText("Área del rombo: " + resultado);
        } else {
            tvResultado.setText("Por favor, ingrese las diagonales del rombo.");
        }
    }
}
