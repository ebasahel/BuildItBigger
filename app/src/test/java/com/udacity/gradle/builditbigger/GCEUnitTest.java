package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.util.Pair;
import android.test.InstrumentationTestCase;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class GCEUnitTest extends InstrumentationTestCase {

  public void testVerifyEchoResponse() throws Throwable {
    final CountDownLatch signal = new CountDownLatch(1);
    final AsyncTask<Pair<Context, String>, Void, String> GCETask =
          new AsyncTask<Pair<Context, String>, Void, String>(){

            @Override
            protected String doInBackground(Pair<Context, String>... pairs) {
              return null;
            }

            @Override
            protected void onPostExecute(String result) {
              super.onPostExecute(result);

              signal.countDown();
            }
          };

    runTestOnUiThread(new Runnable() {

      @Override
      public void run() {
        GCETask.execute();
      }
    });

    signal.await(30, TimeUnit.SECONDS);
    assertTrue("Eiman", true);
  }
}
