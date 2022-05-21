package com.example.franko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<FamilyMember> familyMembers = new ArrayList<>();

        familyMembers.add(new FamilyMember("2b", "Father",
                R.drawable.family_father));
        familyMembers.add(new FamilyMember("2om", "Mother",
                R.drawable.family_mother));
        familyMembers.add(new FamilyMember("2bn", "Son",
                R.drawable.family_son));
        familyMembers.add(new FamilyMember("Bnt", "Daughter",
                R.drawable.family_daughter));
        familyMembers.add(new FamilyMember("25 2kbr", "Older Brother",
                R.drawable.family_older_brother));
        familyMembers.add(new FamilyMember("25 2s8r", "Younger Brother",
                R.drawable.family_younger_brother));
        familyMembers.add(new FamilyMember("2o5t 2kbr", "Older Sister",
                R.drawable.family_older_sister));
        familyMembers.add(new FamilyMember("2o5t 2s8r", "Younger Sister",
                R.drawable.family_younger_sister));
        familyMembers.add(new FamilyMember("Gd", "Grandfather",
                R.drawable.family_grandfather));
        familyMembers.add(new FamilyMember("Gdh", "GrandMother",
                R.drawable.family_grandmother));

        FamilyMemberAdapter familyMemberAdapter = new FamilyMemberAdapter(familyMembers);

        RecyclerView FamilyMembersRecyclerView = findViewById(R.id.recycler_view_family_members);
        FamilyMembersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        FamilyMembersRecyclerView.setAdapter(familyMemberAdapter);

        familyMemberAdapter.setOnItemClickListener(position ->
                Toast.makeText(FamilyMembersActivity.this,
                        familyMembers.get(position).getEnglishFamilyMember() + " = " +
                                familyMembers.get(position).getFrankoFamilyMember(),
                        Toast.LENGTH_SHORT).show());
    }
}