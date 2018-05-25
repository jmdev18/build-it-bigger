package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.test.AndroidTestCase;
import android.util.Pair;


public class FunctionalTest extends AndroidTestCase {
    public void testAsyncTask() {
        try {
            String fetchJoke = new EndpointsAsyncTask(getContext()).execute().get();
            assertNotNull(fetchJoke);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testNotEmptyString() {
        try {
            String fetchJoke = new EndpointsAsyncTask(getContext()).execute().get();
            assertNotSame("", fetchJoke);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}