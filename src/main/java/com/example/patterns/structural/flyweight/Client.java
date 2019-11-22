package com.example.patterns.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        WordProcessor wordProcessor = new WordProcessor();

        String text = "I am a word processor!";
        int lenght = text.length();

        ObjectFactory factory = new ObjectFactory();

        for (int i = 0; i < lenght; i++) {
            String value = text.substring(i, i+1);
            wordProcessor.addLetter((Letter) factory.createObject(value));
        }

        wordProcessor.printLetters();
    }
}
