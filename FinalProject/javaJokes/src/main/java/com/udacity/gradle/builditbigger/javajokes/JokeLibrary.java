package com.udacity.gradle.builditbigger.javajokes;

import java.util.Random;

public class JokeLibrary {

    public static String tellRandomJoke() {
        int randomNumber = new Random().nextInt(4);
        switch (randomNumber) {
            case 0:
                return tellJoke0();
            case 1:
                return tellJoke1();
            case 2:
                return tellJoke2();
            case 3:
                return tellJoke3();
            default:
                return "";
        }
    }

    public static String tellJoke0() {
        return "How do trees get on the Internet? They LOG on!";
    }

    public static String tellJoke1() {
        return "What do you call a guy with no arms or legs in the middle of the ocean? BOB!";
    }

    public static String tellJoke2() {
        return "Where do trees go to work out? The fitness BRANCH!";
    }

    public static String tellJoke3() {
        return "Thirty cows on a field. Twenty-eight chickens. How many didn't? Ten.";
    }
}