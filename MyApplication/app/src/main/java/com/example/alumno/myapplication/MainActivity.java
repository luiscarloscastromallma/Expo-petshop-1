package com.example.alumno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
Button btnGo;
Button btnGo2;
Button btnGo3;
Button btnGo4;
Button btnGo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("bichito","la aplicación acaba de ingresar a oncreate");
        btnGo = (Button)findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,DetalleActivity.class);
                MainActivity.this.startActivity(x);

            }
        });

        btnGo2 = (Button)findViewById(R.id.btnGo2);
        btnGo2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent x = new Intent(MainActivity.this,Detalle2Activity.class);
                    MainActivity.this.startActivity(x);

                }
            });
        btnGo3 = (Button)findViewById(R.id.btnGo3);
        btnGo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,Detalle3Activity.class);
                MainActivity.this.startActivity(x);

            }
        });
        btnGo4 = (Button)findViewById(R.id.btnGo4);
        btnGo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,Detalle4Activity.class);
                MainActivity.this.startActivity(x);

            }
        });
        btnGo5 = (Button)findViewById(R.id.btnGo5);
        btnGo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,Detalle5Activity.class);
                MainActivity.this.startActivity(x);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("bichito","La aplicación acaba de ingresar a onstart");
    }
    @Override
    protected void onResume() {
        super.onResume();
       // Toast.makeText(this, "Gracias por usar", Toast.LENGTH_SHORT).show();
        Log.v("bichito","La aplicación acaba de ingresar a onresume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.v("bichito","La aplicación acaba de ingresar a onpause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.v("bichito","La aplicación acaba de ingresar a onstop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("bichito","La aplicación acaba de ingresar a ondestroy");
    }

}



