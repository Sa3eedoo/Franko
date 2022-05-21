package com.example.franko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Phrase> phrases = new ArrayList<>();

        phrases.add(new Phrase("Anta 3beet?", "Are you an idiot?"));
        phrases.add(new Phrase("kfk", "High five"));
        phrases.add(new Phrase("Tabn lk", "Fuck you"));
        phrases.add(new Phrase("El gw tha23a 5alth", "The weather is very cold"));

        PhraseAdapter phraseAdapter = new PhraseAdapter(phrases);

        RecyclerView phrasesRecyclerView = findViewById(R.id.recycler_view_phrases);
        phrasesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        phrasesRecyclerView.setAdapter(phraseAdapter);

        phraseAdapter.setOnItemClickListener(position ->
                Toast.makeText(PhrasesActivity.this,
                        phrases.get(position).getEnglishPhrase() + " = " +
                                phrases.get(position).getFrankoPhrase(),
                        Toast.LENGTH_SHORT).show());
    }
}