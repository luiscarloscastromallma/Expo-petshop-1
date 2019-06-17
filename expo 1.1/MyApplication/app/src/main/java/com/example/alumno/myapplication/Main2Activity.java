package com.example.alumno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alumno.myapplication.models.Detalle2Activity;
import com.example.alumno.myapplication.models.Detalle3Activity;
import com.example.alumno.myapplication.models.Detalle4Activity;
import com.example.alumno.myapplication.models.DetalleActivity;

public class Main2Activity extends AppCompatActivity {
    Button btnGo;
    Button btnGo2;
    Button btnGo3;
    Button btnGo4;
    Button btnGo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.v("bichito", "la aplicación acaba de ingresar a oncreate");
        btnGo = (Button) findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Main2Activity.this, DetalleActivity.class);
                Main2Activity.this.startActivity(x);

            }
        });

        btnGo2 = (Button) findViewById(R.id.btnGo2);
        btnGo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Main2Activity.this, Detalle2Activity.class);
                Main2Activity.this.startActivity(x);

            }
        });
        btnGo3 = (Button) findViewById(R.id.btnGo3);
        btnGo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Main2Activity.this, Detalle3Activity.class);
                Main2Activity.this.startActivity(x);

            }
        });
        btnGo4 = (Button) findViewById(R.id.btnGo4);
        btnGo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Main2Activity.this, Detalle4Activity.class);
                Main2Activity.this.startActivity(x);

            }
        });
    }
    }