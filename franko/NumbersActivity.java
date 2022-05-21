package com.example.franko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(new Number("Wa7d", "One", R.drawable.number_one));
        numbers.add(new Number("Etnin", "Two", R.drawable.number_two));
        numbers.add(new Number("Tlata", "Three", R.drawable.number_three));
        numbers.add(new Number("2rb3a", "Four", R.drawable.number_four));
        numbers.add(new Number("5amsa", "Five", R.drawable.number_five));
        numbers.add(new Number("Sta", "Six", R.drawable.number_six));
        numbers.add(new Number("Sb3a", "Seven", R.drawable.number_seven));
        numbers.add(new Number("Tamnia", "Eight", R.drawable.number_eight));
        numbers.add(new Number("Ts3a", "Nine", R.drawable.number_nine));
        numbers.add(new Number("3shra", "Ten", R.drawable.number_ten));

        NumberAdapter numberAdapter = new NumberAdapter(numbers);

        RecyclerView numbersRecyclerView = findViewById(R.id.recycler_view_numbers);
        numbersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        numbersRecyclerView.setAdapter(numberAdapter);

        numberAdapter.setOnItemClickListener(position ->
                Toast.makeText(NumbersActivity.this,
                        numbers.get(position).getEnglishNumber() + " = " +
                                numbers.get(position).getFrankoNumber(),
                        Toast.LENGTH_SHORT).show());
    }
}