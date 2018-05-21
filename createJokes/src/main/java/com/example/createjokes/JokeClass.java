package com.example.createjokes;

import java.util.ArrayList;
import java.util.List;

public class JokeClass {
  private List<String> JokeList =new ArrayList<>();

  public JokeClass (){
    addJokes();
  }
  private void addJokes()
  {
    JokeList.add("I asked my French friend if she likes to play video games. She said, \"Wii.\"\n" +
            "\n");
    JokeList.add("Yesterday, a clown held the door open for me. It was such a nice jester!");
    JokeList.add("Cleaning with kids in the house is like brushing your teeth with Oreos.");
  }
  public List<String> getJokes ()
  {
    return JokeList;
  }
}
