package com.udacity.gradle.builditbigger.javajokes;

import java.util.Random;

public class JokeLibrary {

    private static final String[] jokes =
            {"How do trees get on the Internet? They LOG on!",
                    "What do you call a guy with no arms or legs in the middle of the ocean? BOB!",
                    "Where do trees go to work out? The fitness BRANCH!",
                    "Thirty cows on a field. Twenty-eight chickens. How many didn't? Ten."};

    public static String tellRandomJoke() {
        return jokes[new Random().nextInt(4)];
    }
}