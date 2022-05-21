package com.example.franko;

public class Number {

    private String frankoNumber;
    private String englishNumber;
    private int imageId;

    public Number(String frankoNumber, String englishNumber, int imageId) {
        this.frankoNumber = frankoNumber;
        this.englishNumber = englishNumber;
        this.imageId = imageId;
    }

    public String getFrankoNumber() {
        return frankoNumber;
    }

    public String getEnglishNumber() {
        return englishNumber;
    }

    public int getImageId() {
        return imageId;
    }

}
