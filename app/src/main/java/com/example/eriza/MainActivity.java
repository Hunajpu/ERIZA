package com.example.eriza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button botonLogin = findViewById(R.id.button);
        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText user = findViewById(R.id.editTextTextEmailAddress);
                EditText pass = findViewById(R.id.editTextTextPassword);

                if(user.getText().toString().equals("admin") && pass.getText().toString().equals("admin")){
                    abrirAdmin();
                }
                if(user.getText().toString().equals("user") && pass.getText().toString().equals("user")){
                    abrirUsuario();
                }
            }
        });
    }

    //Método para abrir la ventana del admin
    public void abrirAdmin(){
        Intent intent = new Intent(MainActivity.this, AdminActivity.class);
        startActivity(intent);
    }

    //Método para abrir la ventana del usuario
    public void abrirUsuario(){
        Intent intent = new Intent(MainActivity.this, userActivity.class);
        startActivity(intent);
    }

}
