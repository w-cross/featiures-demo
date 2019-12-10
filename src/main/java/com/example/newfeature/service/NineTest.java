package com.example.newfeature.service;

public interface NineTest {


    default void sayHello() {
        System.out.println(words());
    }

    static String words() {
        return "helloWorld";
    }
}
