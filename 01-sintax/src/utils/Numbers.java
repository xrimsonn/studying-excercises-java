package utils;

public class Numbers {
  public static Integer biggest(int[] numbers) {
    int x, y, biggest = 0;
    for (int i = 0; i < numbers.length; i++) {
      x = numbers[i];
      for (int j = 0; j < numbers.length; j++) {
        y = numbers[j];
        biggest = x >= y ? x : y;
      }
    }
    return biggest;
  }
}
