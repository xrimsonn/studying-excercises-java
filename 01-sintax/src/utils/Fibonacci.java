package utils;

public class Fibonacci {
  public static int[] generateSequence(int size) {
    size = (size > 0) ? size : 0;
    int first = 0, second = 1, swap = 0;

    int[] sequence = new int[size];

    for (int i = 0; i < size; i++) {
      sequence[i] = first;
      swap = first + second;
      first = second;
      second = swap;
    }

    return sequence;
  }
}
