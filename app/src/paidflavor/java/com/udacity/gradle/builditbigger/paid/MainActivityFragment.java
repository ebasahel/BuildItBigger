package com.udacity.gradle.builditbigger.paid;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.displayjokes.DisplayJokes;
import com.udacity.gradle.builditbigger.R;

public class MainActivityFragment extends Fragment implements DisplayJokes.onJokeReceived {

  public MainActivityFragment() {
  }
  private TextView txtDisplayJokes;
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View root =inflater.inflate(R.layout.fragment_main, container, false);
    txtDisplayJokes = root.findViewById(R.id.txt_display_jokes);
    return root;
  }

  @Override
  public void setJokes(String result) {
    txtDisplayJokes.setText(result);
  }
}