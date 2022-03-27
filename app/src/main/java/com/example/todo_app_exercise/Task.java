package com.example.todo_app_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Task extends AppCompatActivity {

    TextView Nama,txTask, txJenis, txTime;

    FloatingActionButton apa;
    String task,jenis,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        txTask = findViewById(R.id.tvTask);
        txJenis = findViewById(R.id.tvJenistask);
        txTime  = findViewById(R.id.tvTimetask);
        apa = findViewById(R.id.faButton);

        Nama = findViewById(R.id.tvusername);


        Bundle bundle = getIntent().getExtras();

        String Indra = bundle.getString("ab");

        Nama.setText(Indra);

        apa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                task = txTask.getText().toString();
                jenis = txJenis.getText().toString();
                time = txTime.getText().toString();

                if (txTask.getText().toString().isEmpty()||txJenis.getText().toString().isEmpty()
                ||txTime.getText().toString().isEmpty()){
                    txJenis.setError("JEnis Task!");
                    txTime.setError("Lama Task!");
                    Toast.makeText(getApplicationContext(), "Data harus di isi", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_SHORT).show();
                    Bundle ya = new Bundle();

                    ya.putString("task",txTask.getText().toString().trim());
                    ya.putString("jenis", txJenis.getText().toString().trim());
                    ya.putString("time", txTime.getText().toString().trim());

                    Intent lo = new Intent(getApplicationContext(), hasil.class);

                    lo.putExtras(ya);
                    startActivity(lo);

                }

            }
        });
    }
}