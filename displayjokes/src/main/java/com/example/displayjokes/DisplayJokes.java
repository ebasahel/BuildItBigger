package com.example.displayjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DisplayJokes extends AppCompatActivity {

  private List<String> jokes;
  public static final String JOKES_EXTRA ="Jokes extra";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_jokes);
    jokes= new ArrayList<>();
    if (getIntent().getExtras()!= null)
      jokes = (getIntent().getStringArrayListExtra(JOKES_EXTRA));

    displayJokes (jokes);
  }

  private void displayJokes (List<String> jokeList)
  {
    finish();
    Random rand = new Random();
    int n       = rand.nextInt(2) + 1;
    Toast.makeText(this, jokeList.get(n), Toast.LENGTH_SHORT).show();
  }
}
