package com.example.loginintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.txtuser);
        pass = (EditText) findViewById(R.id.txtpass);
        btnlogin = (Button) findViewById(R.id.btnlog);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username,password;
                username = user.getText().toString();
                password = pass.getText().toString();
                if(username.equals("Admin")&&password.equals("123")){
                    Toast.makeText(MainActivity.this,"Login Berhasil",Toast.LENGTH_SHORT).show();
                    Intent pindah = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(pindah);
                } else if(username.equals("User")&&password.equals("1233")) {
                    Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    Intent pindah = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(pindah);
                }else {
                    Toast.makeText(MainActivity.this,"USERNAME DAN PASSWORD SALAH",
                    Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}