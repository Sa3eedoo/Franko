package com.example.franko;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PhraseAdapter extends RecyclerView.Adapter<PhraseAdapter.PhraseViewHolder> {

    private List<Phrase> phrases;
    private OnItemClickListener listener;

    public PhraseAdapter(List<Phrase> phrases) {
        this.phrases = phrases;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public PhraseAdapter.PhraseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_phrase, parent, false);

        PhraseAdapter.PhraseViewHolder holder = new PhraseAdapter.PhraseViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PhraseAdapter.PhraseViewHolder holder, int position) {
        Phrase phrase = phrases.get(position);

        String frankoPhrase = phrase.getFrankoPhrase();
        String englishPhrase = phrase.getEnglishPhrase();

        holder.frankoPhraseTextView.setText(frankoPhrase);
        holder.englishPhraseTextView.setText(englishPhrase);
    }

    @Override
    public int getItemCount() {
        return phrases.size();
    }

    class PhraseViewHolder extends RecyclerView.ViewHolder {

        private TextView frankoPhraseTextView;
        private TextView englishPhraseTextView;

        public PhraseViewHolder(@NonNull View itemView) {
            super(itemView);

            frankoPhraseTextView = itemView.findViewById(R.id.text_view_franko_phrase);
            englishPhraseTextView = itemView.findViewById(R.id.text_view_english_phrase);

            itemView.setOnClickListener(v -> {
                if (listener != null && getAdapterPosition() != RecyclerView.NO_POSITION) {
                    listener.onItemClick(getAdapterPosition());
                }
            });
        }
    }
}
