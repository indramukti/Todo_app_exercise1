package com.example.todo_app_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel untuk button
    Button btnLogin,btnRegist;

    //deklarasi variabel untuk EditText
    private EditText edemail, edpassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnLogin dengan component pada layout
         btnLogin = findViewById(R.id.btSignin);
        //menghubungkan variabel edemail dengan component pada layout
        edemail = findViewById(R.id.edEmail);
        //menghubungkan variabel edpassword dengan component pada layout
        edpassword = findViewById(R.id.edPassword);

        btnRegist = findViewById(R.id.btnregister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();
                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                String email = "indramukti";

                String pass = "121212";

                if (nama.equals(email) || password.equals(pass)) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "login berhasil", Toast.LENGTH_LONG);
                    t.show();
                    Bundle b = new Bundle();
                    b.putString("ab",nama.trim());

                    b.putString("bc",password.trim());

                    Intent i = new Intent(getApplicationContext(), Task.class);
                    i.putExtras(b);
                    startActivity(i);

                } else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "username dan password anda salah", Toast.LENGTH_LONG);
                    t.show();
                }

            }

        });

        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent apa = new Intent(getApplicationContext(),Regist.class);
                startActivity(apa);
            }
        });

    }
}