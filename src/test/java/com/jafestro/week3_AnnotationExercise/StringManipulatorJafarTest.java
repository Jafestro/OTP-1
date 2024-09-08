package com.jafestro.week3_AnnotationExercise;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringManipulatorJafarTest {

    private static StringManipulatorJafar manipulator;

    @BeforeAll
    public static void setupClass() {
        System.out.println("BeforeAll: Initializing resources shared by all tests");
        manipulator = new StringManipulatorJafar(); // Initialize class object
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("AfterAll: Cleaning up resources shared by all tests");
        manipulator = null; // Cleanup
    }

    @BeforeEach
    public void setup() {
        System.out.println("BeforeEach: Setting up before each test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("AfterEach: Cleaning up after each test");
    }

    @Test
    public void testReverse() {
        System.out.println("Test Reverse");
        String input = "Hello";
        String expected = "olleH";
        String result = manipulator.reverse(input);
        assertEquals(expected, result);
    }

    @Test
    public void testCapitalize() {
        System.out.println("Test Capitalize");
        String input = "hello";
        String expected = "HELLO";  // For the current capitalize method
        String result = manipulator.capitalize(input);
        assertEquals(expected, result);
    }
}
