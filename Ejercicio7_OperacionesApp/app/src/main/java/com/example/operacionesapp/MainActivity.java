package com.example.operacionesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);
    }

    //Metodo sumar:
    public void sumar (View View){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);

        int suma=n1+n2;

        String resu = String.valueOf(suma);
        tv1.setText(resu);
    }
    //Metodo Resta:
    public void restar (View View){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);

        int resta=n1-n2;

        String resu = String.valueOf(resta);
        tv1.setText(resu);
    }
    //Metodo Multiplicacion:
    public void multiplicar (View View){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);

        int multiplicacion=n1*n2;

        String resu = String.valueOf(multiplicacion);
        tv1.setText(resu);
    }
    //Metodo Division:
    public void dividir (View View){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);

        int division=n1/n2;

        String resu = String.valueOf(division);
        tv1.setText(resu);
    }
}