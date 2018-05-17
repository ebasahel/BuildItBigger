package com.example.createjokes;

import java.util.ArrayList;
import java.util.List;

public class JokeClass {
  private  static List<String> JokeList =new ArrayList<>();
  public static List<String> getJokes ()
  {
    JokeList.add("I asked my French friend if she likes to play video games. She said, \"Wii.\"\n" +
            "\n");
    JokeList.add("Yesterday, a clown held the door open for me. It was such a nice jester!");
    JokeList.add("Cleaning with kids in the house is like brushing your teeth with Oreos.");

    return JokeList;
  }
}
