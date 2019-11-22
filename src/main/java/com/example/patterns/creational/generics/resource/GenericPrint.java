package com.example.patterns.creational.generics.resource;

public class GenericPrint<E> {

    public void print(E[] list) {
        for (E e: list) {
            System.out.println(e);
        }
    }
}
