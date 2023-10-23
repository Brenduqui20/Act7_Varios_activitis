package com.example.act7_varios_activitis;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class TrianguloActivity extends AppCompatActivity {

    private EditText etBase;
    private EditText etAltura;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        etBase = findViewById(R.id.etBase);
        etAltura = findViewById(R.id.etAltura);
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
                finish(); // Cierra esta actividad y regresa a la actividad anterior
            }
        });
    }

    private void calcularArea() {
        String baseStr = etBase.getText().toString().trim();
        String alturaStr = etAltura.getText().toString().trim();

        if (!baseStr.isEmpty() && !alturaStr.isEmpty()) {
            double base = Double.parseDouble(baseStr);
            double altura = Double.parseDouble(alturaStr);
            double area = (base * altura) / 2;

            // Redondear el resultado a dos decimales
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String resultado = "Área del triángulo: " + decimalFormat.format(area);

            tvResultado.setText(resultado);
        } else {
            tvResultado.setText("Por favor, introduce la base y la altura del triángulo.");
        }
    }
}
