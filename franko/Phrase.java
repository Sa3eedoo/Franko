package com.example.franko;

public class Phrase {

    private String frankoPhrase;
    private String englishPhrase;


    public Phrase(String frankoPhrase, String englishPhrase) {
        this.frankoPhrase = frankoPhrase;
        this.englishPhrase = englishPhrase;
    }

    public String getFrankoPhrase() {
        return frankoPhrase;
    }

    public String getEnglishPhrase() {
        return englishPhrase;
    }

}
