package utils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Vowels {
  public static Integer count(String text) {
    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    int count = 0;
    for (char c : text.toLowerCase().toCharArray()) {
      if (vowels.contains(c)) {
        count++;
      }
    }
    return count;
  }
}
