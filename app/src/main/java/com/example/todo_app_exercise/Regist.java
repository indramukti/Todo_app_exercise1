package com.example.todo_app_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class Regist extends AppCompatActivity {

    EditText ednama, edemail, edpass, edrepass;
    Button btnregis;
    String nama, email, password, repass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        btnregis = findViewById(R.id.btnRegister);
        ednama = findViewById(R.id.edNama);
        edemail = findViewById(R.id.edEmail);
        edpass = findViewById(R.id.edPassword);
        edrepass = findViewById(R.id.edRepassword);



        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = ednama.getText().toString();
                email = edemail.getText().toString();
                password = edpass.getText().toString();
                repass = edrepass.getText().toString();


                if (ednama.getText().toString().length()==0){
                    ednama.setError("Nama Diperlukan!!");
                }
                if (edemail.getText().toString().length()==0){
                    edemail.setError("Email Diperlukan!!");
                }
                if (edpass.getText().toString().length()==0){
                    edpass.setError("Password Diperlukan!!");
                }
                if (edrepass.getText().toString().length()==0){
                    edrepass.setError("Re-Password Diperlukan!!");
                }
                if (nama.isEmpty() || email.isEmpty() || password.isEmpty()|| repass.isEmpty())
                {
                    Snackbar.make(view, "Isi Semua Data!", Snackbar.LENGTH_LONG).show();
                }
                else {
                    if (edpass.getText().toString().equals(edrepass.getText().toString())) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Berhasil", Toast.LENGTH_LONG);
                        t.show();

                        Intent i = new Intent(getApplicationContext(), Task.class);
                        startActivity(i);
                    } else {
                        Snackbar.make(view, "Password dan Re Password harus sama!!!",
                                Snackbar.LENGTH_LONG).show();
                    }

                }
            }

        });
    }
}