package com.example.franko;

public class FamilyMember {

    private String frankoFamilyMember;
    private String englishFamilyMember;
    private int imageId;

    public FamilyMember(String frankoFamilyMember, String englishFamilyMember, int imageId) {
        this.frankoFamilyMember = frankoFamilyMember;
        this.englishFamilyMember = englishFamilyMember;
        this.imageId = imageId;
    }

    public String getFrankoFamilyMember() {
        return frankoFamilyMember;
    }

    public String getEnglishFamilyMember() {
        return englishFamilyMember;
    }

    public int getImageId() {
        return imageId;
    }
}
