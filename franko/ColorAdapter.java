package com.example.franko;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ColorViewHolder> {

    private List<color> colors;
    private OnItemClickListener listener;

    public ColorAdapter(List<color> colors) {
        this.colors = colors;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ColorAdapter.ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_color, parent, false);

        ColorAdapter.ColorViewHolder holder = new ColorAdapter.ColorViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ColorAdapter.ColorViewHolder holder, int position) {
        color color = colors.get(position);

        String frankoColor = color.getFrankoColor();
        String englishColor = color.getEnglishColor();
        int imageId = color.getImageId();

        holder.frankoColorTextView.setText(frankoColor);
        holder.englishColorTextView.setText(englishColor);
        holder.imageIdImageView.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return colors.size();
    }

    class ColorViewHolder extends RecyclerView.ViewHolder {

        private TextView frankoColorTextView;
        private TextView englishColorTextView;
        private ImageView imageIdImageView;

        public ColorViewHolder(@NonNull View itemView) {
            super(itemView);

            frankoColorTextView = itemView.findViewById(R.id.text_view_franko_color);
            englishColorTextView = itemView.findViewById(R.id.text_view_english_color);
            imageIdImageView = itemView.findViewById(R.id.image_view_color);

            itemView.setOnClickListener(v -> {
                if (listener != null && getAdapterPosition() != RecyclerView.NO_POSITION) {
                    listener.onItemClick(getAdapterPosition());
                }
            });
        }
    }
}