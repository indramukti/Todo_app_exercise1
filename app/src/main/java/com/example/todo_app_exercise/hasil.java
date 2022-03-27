package com.example.todo_app_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hasil extends AppCompatActivity {
    TextView txTask, txJenis, txTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txTask = findViewById(R.id.tvTask);
        txJenis = findViewById(R.id.tvJenistask);
        txTime  = findViewById(R.id.tvTimetask);

        Bundle bundle = getIntent().getExtras();

        String task = bundle.getString("task");
        String jenis = bundle.getString("jenis");
        String time = bundle.getString("time");

        txTask.setText(task);
        txJenis.setText(jenis);
        txTime.setText(time);
    }
}