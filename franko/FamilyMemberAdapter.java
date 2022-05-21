package com.example.franko;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FamilyMemberAdapter extends RecyclerView.Adapter<FamilyMemberAdapter.
        FamilyMemberViewHolder> {

    private List<FamilyMember> familyMembers;
    private OnItemClickListener listener;

    public FamilyMemberAdapter(List<FamilyMember> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public FamilyMemberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_family_member, parent, false);

        FamilyMemberViewHolder holder = new FamilyMemberViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FamilyMemberViewHolder holder, int position) {
        FamilyMember familyMember = familyMembers.get(position);

        String frankoFamilyMember = familyMember.getFrankoFamilyMember();
        String englishFamilyMember = familyMember.getEnglishFamilyMember();
        int imageId = familyMember.getImageId();

        holder.frankoFamilyMemberTextView.setText(frankoFamilyMember);
        holder.englishFamilyMemberTextView.setText(englishFamilyMember);
        holder.imageIdImageView.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return familyMembers.size();
    }

    class FamilyMemberViewHolder extends RecyclerView.ViewHolder {

        private TextView frankoFamilyMemberTextView;
        private TextView englishFamilyMemberTextView;
        private ImageView imageIdImageView;

        public FamilyMemberViewHolder(@NonNull View itemView) {
            super(itemView);

            frankoFamilyMemberTextView = itemView.findViewById(R.id.text_view_franko_family_member);
            englishFamilyMemberTextView = itemView.findViewById(R.id.text_view_english_family_member);
            imageIdImageView = itemView.findViewById(R.id.image_view_family_member);

            itemView.setOnClickListener(v -> {
                if (listener != null && getAdapterPosition() != RecyclerView.NO_POSITION) {
                    listener.onItemClick(getAdapterPosition());
                }
            });
        }
    }
}