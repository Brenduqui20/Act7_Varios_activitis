package com.example.act7_varios_activitis;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class EsferaActivity extends AppCompatActivity {

    private EditText etRadio;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);

        etRadio = findViewById(R.id.etRadio);
        tvResultado = findViewById(R.id.tvResultado);
        Button btnCalcular = findViewById(R.id.btnCalcular);
        Button btnRegresar = findViewById(R.id.btnRegresar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularVolumen();
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cerrar la actividad actual y regresar a la actividad anterior
                finish();
            }
        });
    }

    private void calcularVolumen() {
        String radioStr = etRadio.getText().toString().trim();

        if (!radioStr.isEmpty()) {
            double radio = Double.parseDouble(radioStr);
            double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

            // Redondear el resultado a dos decimales
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String resultado = decimalFormat.format(volumen);

            tvResultado.setText("Volumen de la esfera: " + resultado);
        } else {
            tvResultado.setText("Por favor, introduce el radio de la esfera.");
        }
    }
}
