package com.example.franko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<color> colors = new ArrayList<>();

        colors.add(new color("27mr", "Red", R.drawable.color_red));
        colors.add(new color("2sod", "Black", R.drawable.color_black));
        colors.add(new color("Bony", "Brown", R.drawable.color_brown));
        colors.add(new color("Rosasy", "Gray", R.drawable.color_gray));
        colors.add(new color("25dr", "Green", R.drawable.color_green));
        colors.add(new color("2sfr Mtrb", "Dusty Yellow",
                R.drawable.color_dusty_yellow));
        colors.add(new color("2sfr Mostarda", "Mustard Yellow",
                R.drawable.color_mustard_yellow));
        colors.add(new color("2byd", "White", R.drawable.color_white));

        ColorAdapter colorAdapter = new ColorAdapter(colors);

        RecyclerView colorsRecyclerView = findViewById(R.id.recycler_view_colors);
        colorsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        colorsRecyclerView.setAdapter(colorAdapter);

        colorAdapter.setOnItemClickListener(position ->
                Toast.makeText(ColorsActivity.this,
                        colors.get(position).getEnglishColor() + " = " +
                                colors.get(position).getFrankoColor(),
                        Toast.LENGTH_SHORT).show());
    }
}