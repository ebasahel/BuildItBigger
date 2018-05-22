package com.example.displayjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokes extends AppCompatActivity{

  private String         jokes;
  private TextView txtDisplayJokes;
  public static final String JOKES_EXTRA = "Jokes extra";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_jokes);
    txtDisplayJokes = findViewById(R.id.txt_display_jokes);

    if (getIntent().getExtras() != null)
      jokes = getIntent().getExtras().getString(JOKES_EXTRA);

    displayJokes(jokes);

  }


  private void displayJokes(String result) {
    txtDisplayJokes.setText(result);
  }

}
