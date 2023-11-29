package org.deepu.example;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

  public static boolean level(int[] obstacles, String instructions) {
    Set<Integer> obstaclesSet = Arrays.stream(obstacles).boxed().collect(Collectors.toSet());

    boolean returnValue = false;
    int position = 0;
    Character previousMove = null;

    for (char c : instructions.toCharArray()) {
      switch (c) {
        case 'R' -> {
          position++;
          previousMove = 'R';
        }
        case 'L' -> {
          position--;
          previousMove = 'L';
        }
        case 'J' -> position =
            switch (previousMove) {
              case 'R' -> position + 2;
              case null -> position + 2;
              case 'L' -> position - 2;
              default -> position;
            };
      }
      if (position >= 10) {
        return true;
      }
      if (position < 0 || obstaclesSet.contains(position)) {
        return false;
      }
    }
    return returnValue;
  }
}
