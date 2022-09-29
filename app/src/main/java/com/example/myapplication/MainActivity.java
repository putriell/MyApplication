package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Animal> animals = new ArrayList<>();
    private AnimalAdapter animalAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        animalAdapter = new AnimalAdapter(this, animals);
        recyclerView = findViewById(R.id.rv_animal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(animalAdapter);
    }

    private void addData() {
        animals.add(new Animal("kucing", "abu abu", "kucing berkaki 4"));
        animals.add(new Animal("ular", "coklat", "kucing berkaki 4"));
        animals.add(new Animal("buaya", "kuning", "kucing berkaki 4"));
        animals.add(new Animal("kucing", "putih", "kucing berkaki 4"));
    }
}
