package com.example.franko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView numbersTextView = findViewById(R.id.text_view_numbers);
        numbersTextView.setOnClickListener(v -> {
            Intent numbersIntent = new Intent(this, NumbersActivity.class);
            startActivity(numbersIntent);
        });

        TextView familyMemberTextView = findViewById(R.id.text_view_family_members);
        familyMemberTextView.setOnClickListener(v -> {
            Intent familyMemberIntent = new Intent(this, FamilyMembersActivity.class);
            startActivity(familyMemberIntent);
        });

        TextView colorsTextView = findViewById(R.id.text_view_colors);
        colorsTextView.setOnClickListener(v -> {
            Intent colorsIntent = new Intent(this, ColorsActivity.class);
            startActivity(colorsIntent);
        });

        TextView phrasesTextView = findViewById(R.id.text_view_phrases);
        phrasesTextView.setOnClickListener(v -> {
            Intent phrasesIntent = new Intent(this, PhrasesActivity.class);
            startActivity(phrasesIntent);
        });
    }
}