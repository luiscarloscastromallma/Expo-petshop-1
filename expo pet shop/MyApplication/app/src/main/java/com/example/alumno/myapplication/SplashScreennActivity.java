package com.example.alumno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.alumno.myapplication.activities.LoginActivity;

public class SplashScreennActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent o = new Intent(this, LoginActivity.class);
        startActivity(o);
        try {
            Thread.sleep (5000);
        }
        catch (Exception e) {
            finish();
        //esta linea impide que el usuario vuelva con el historial
    }
}
}