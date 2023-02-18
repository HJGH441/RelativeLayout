package com.example.relativelayaout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bnCanal = findViewById(R.id.botoncanal);
        EditText  Barra = findViewById(R.id.Barra);
        TextView tvCanal = findViewById(R.id.tvCanal);
        Spinner spinner = findViewById(R.id.spinner1);
        ImageView  imageView = findViewById(R.id.imContinue);
        ivContinuara = findViewById(R.id.imContinue);
        spinner.setOnItemSelectedListener(this);
        bnCanal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = Barra.getText().toString();
                Toast.makeText(MainActivity.this,"El valor es "+text, Toast.LENGTH_SHORT).show();
                tvCanal.setText(text);


            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent (MainActivity.this, Datos_Activity.class);
                startActivity(i);
            }
        });
    }
    private ImageView ivContinuara;

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int posicion, long l) {
        String programa = adapterView.getItemAtPosition(posicion).toString();
        Snackbar.make(adapterView, "Programa Seleccionado" +programa,
                Snackbar.LENGTH_LONG
                ).show();
        if(posicion == 0){
            ivContinuara.setImageResource(R.drawable.descarga);
        }else if (posicion == 1){
            ivContinuara.setImageResource(R.drawable.tobe);
        }else{
            ivContinuara.setImageResource(R.drawable.tobecon);
        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}