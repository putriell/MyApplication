package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    private final ArrayList<Animal> values;
    private final LayoutInflater inflater;

    public AnimalAdapter(Context context, ArrayList<Animal> values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AnimalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_animal, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AnimalAdapter.ViewHolder holder, final int position) {
        final Animal animal = values.get(position);
        holder.txtName.setText(animal.name);
        holder.txtcolor.setText(animal.color);
        holder.txtDesc.setText(animal.desc);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(holder.itemView.getContext(), DetailAnimalActivity.class);
               intent.putExtra("name", animal.name);
               intent.putExtra("color", animal.name);
               intent.putExtra("desc", animal.name);
               holder.itemView.getContext().startActivity(intent);


                Toast.makeText(holder.itemView.getContext(), String.valueOf(position), Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtcolor, txtDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
            txtcolor = itemView.findViewById(R.id.txt_color);
            txtDesc = itemView.findViewById(R.id.txt_description);

        }
    }
}
