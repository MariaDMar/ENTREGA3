package com.example.ac.entregas3;
/* MARIA DEL MAR MARTINEZ */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_masa;
    EditText et_altura;
    TextView tv_imc;
    Button btn_calcular;
    TextView tv_resultado;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_masa = findViewById(R.id.et_masa);
        et_altura = findViewById(R.id.et_altura);
        tv_imc = findViewById(R.id.tv_imc);
        btn_calcular = findViewById(R.id.btn_calcular);
        tv_resultado = findViewById(R.id.tv_resultado);

        //control+espacio
        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int masa = Integer.parseInt(et_masa.getText().toString());
                int altura = Integer.parseInt(et_altura.getText().toString());

                double resultado = masa/Math.pow(altura,2);
                String resultadoString = Double.toString(resultado);

                tv_resultado.setText(resultadoString);

                //tv_imc.setText("Hola "+masa);

            }
        });
    }
}

/* MARIA DEL MAR MARTINEZ */