package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;

public class EndpointsAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {

    @Override
    protected String doInBackground(Pair<Context, String>... pairs) {
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
