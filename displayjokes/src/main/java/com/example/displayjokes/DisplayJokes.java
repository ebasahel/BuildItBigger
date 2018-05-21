package com.example.displayjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayJokes extends AppCompatActivity{

  public interface onJokeReceived {
    void setJokes(String result);
  }

  private String         jokes;
  private onJokeReceived jokeListener;
  public static final String JOKES_EXTRA = "Jokes extra";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_jokes);

    if (getIntent().getExtras() != null)
      jokes = getIntent().getExtras().getString(JOKES_EXTRA);

    jokeListener = (onJokeReceived) this;
    displayJokes(jokes);

  }


  private void displayJokes(String result) {
//    Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    jokeListener.setJokes(result);
    finish();
  }

}
