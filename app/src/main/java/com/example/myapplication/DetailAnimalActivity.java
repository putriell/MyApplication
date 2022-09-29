package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailAnimalActivity extends AppCompatActivity {

    TextView txtName, txtColor, txtDesc;
    String name, color, desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_animal);
        txtName = findViewById(R.id.txt_name);
        txtColor = findViewById(R.id.txt_color);
        txtDesc = findViewById(R.id.txt_description);

        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        name = intent.getStringExtra("color");
        name = intent.getStringExtra("desc");

        txtName.setText(name);
        txtColor.setText(color);
        txtDesc.setText(desc);
    }
}
