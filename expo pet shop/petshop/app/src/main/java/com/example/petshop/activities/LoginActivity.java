package com.example.petshop.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.petshop.MainActivity;
import com.example.petshop.R;
import com.example.petshop.models.User;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

        Button Button;
        EditText password;
        EditText usuario;
       // ArrayList<User> listaUsuarios = new ArrayList<>();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            Button boton =(Button) findViewById(R.id.btnStart);
            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String usuario =((EditText) findViewById(R.id.txtUsername)).getText().toString();
                    String paswoord =((EditText) findViewById(R.id.txtPassword)).getText().toString();
                    if (usuario.equals("admin")&& paswoord.equals(("admmin")))
                    {
                        Intent nuevoform = new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(nuevoform);
                    }else
                    {
                        Toast.makeText(getApplicationContext(),"usuario incorrecto",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
}