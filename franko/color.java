package com.example.franko;

public class color {

    private String frankoColor;
    private String englishColor;
    private int imageId;

    public color(String frankoColor, String englishColor, int imageId) {
        this.frankoColor = frankoColor;
        this.englishColor = englishColor;
        this.imageId = imageId;
    }

    public String getFrankoColor() {
        return frankoColor;
    }

    public String getEnglishColor() {
        return englishColor;
    }

    public int getImageId() {
        return imageId;
    }

}
