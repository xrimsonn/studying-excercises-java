package utils;

public class Vowels {
  public static Integer count(String text) {
    int vowels = 0;
    for (char c : text.toCharArray()) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        vowels++;
      }
    }
    return vowels;
  }
}
