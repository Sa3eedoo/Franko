package com.example.franko;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {

    private List<Number> numbers;
    private OnItemClickListener listener;

    public NumberAdapter(List<Number> numbers) {
        this.numbers = numbers;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_number, parent, false);

        NumberViewHolder holder = new NumberViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        Number number = numbers.get(position);

        String frankoNumber = number.getFrankoNumber();
        String englishNumber = number.getEnglishNumber();
        int imageId = number.getImageId();

        holder.frankoNumberTextView.setText(frankoNumber);
        holder.englishNumberTextView.setText(englishNumber);
        holder.imageIdImageView.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }

    class NumberViewHolder extends RecyclerView.ViewHolder {

        private TextView frankoNumberTextView;
        private TextView englishNumberTextView;
        private ImageView imageIdImageView;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);

            frankoNumberTextView = itemView.findViewById(R.id.text_view_franko_number);
            englishNumberTextView = itemView.findViewById(R.id.text_view_english_number);
            imageIdImageView = itemView.findViewById(R.id.image_view_number);

            itemView.setOnClickListener(v -> {
                if (listener != null && getAdapterPosition() != RecyclerView.NO_POSITION) {
                    listener.onItemClick(getAdapterPosition());
                }
            });
        }
    }
}