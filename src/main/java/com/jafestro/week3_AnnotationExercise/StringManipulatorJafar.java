package com.jafestro.week3_AnnotationExercise;

public class StringManipulatorJafar {

    public String reverse(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString();
    }

    public String capitalize(String input) {
        return input.toUpperCase();
    }
}
