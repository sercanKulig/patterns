package com.example.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {

    private List<Letter> letters = new ArrayList<>();

    public void addLetter(Letter letter) {
        this.letters.add(letter);
    }

    public void printLetters() {
        for (Letter letter: letters) {
            System.out.println(letter.getValue());
        }
    }
}
