package com.example.relativelayaout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Datos_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        if(getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                int canal  = extras.getInt ("Canal");
                String Programa = extras.getString ("Programa");
            }

        }
    }
}