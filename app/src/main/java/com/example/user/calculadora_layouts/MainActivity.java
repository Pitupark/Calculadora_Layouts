package com.example.user.calculadora_layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);
    }
    public void suma(View vista){
        double numero1=Integer.parseInt(et1.getText().toString());
        double numero2=Integer.parseInt(et2.getText().toString());
        double suma=numero1+numero2;
        tv1.setText(String.valueOf(suma));
    }
    public void resta (View vista){
        double numero1=Integer.parseInt(et1.getText().toString());
        double numero2=Integer.parseInt(et2.getText().toString());
        double resta=numero1-numero2;
        tv1.setText(String.valueOf(resta));
    }
    public void multiplicar (View vista){
        double numero1=Integer.parseInt(et1.getText().toString());
        double numero2=Integer.parseInt(et2.getText().toString());
        double multiplicar=numero1*numero2;
        tv1.setText(String.valueOf(multiplicar));
    }public void dividir (View vista){
        double numero1=Integer.parseInt(et1.getText().toString());
        double numero2=Integer.parseInt(et2.getText().toString());
        double dividir=numero1/numero2;
        if (numero2 == 0)
            Toast.makeText(getApplicationContext(), "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
        else
            tv1.setText(String.valueOf(dividir));
    }
}
