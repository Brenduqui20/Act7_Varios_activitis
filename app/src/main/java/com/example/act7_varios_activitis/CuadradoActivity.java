package com.example.act7_varios_activitis;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class CuadradoActivity extends AppCompatActivity {

    private EditText etLado;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        etLado = findViewById(R.id.etLado);
        tvResultado = findViewById(R.id.tvResultado);
        Button btnCalcular = findViewById(R.id.btnCalcular);
        Button btnRegresar = findViewById(R.id.btnRegresar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularAreaYPerimetro();
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra esta actividad y regresa a la actividad anterior
            }
        });
    }

    private void calcularAreaYPerimetro() {
        String ladoStr = etLado.getText().toString().trim();

        if (!ladoStr.isEmpty()) {
            double lado = Double.parseDouble(ladoStr);
            double area = lado * lado;
            double perimetro = 4 * lado;

            // Redondear el resultado a dos decimales
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String resultado = "Área del cuadrado: " + decimalFormat.format(area) + "\n"
                    + "Perímetro del cuadrado: " + decimalFormat.format(perimetro);

            tvResultado.setText(resultado);
        } else {
            tvResultado.setText("Por favor, introduce el lado del cuadrado.");
        }
    }
}

