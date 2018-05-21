package com.example.displayjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DisplayJokes extends AppCompatActivity {

  private String jokes;
  public static final String JOKES_EXTRA ="Jokes extra";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_jokes);
    if (getIntent().getExtras()!= null)
      jokes = getIntent().getExtras().getString(JOKES_EXTRA);

    displayJokes (jokes);
  }

  private void displayJokes (String result)
  {
    finish();
    Toast.makeText(this, result, Toast.LENGTH_LONG).show();
  }
}
