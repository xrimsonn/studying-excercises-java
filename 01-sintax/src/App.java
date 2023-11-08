import utils.Fibonacci;
import utils.Vowels;
import utils.Numbers;
import java.util.Scanner;
import java.util.Arrays;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Input a number: ");
      int number = scanner.nextInt();
      System.out.println("Fibonacci sequence: " + Arrays.toString(Fibonacci.generateSequence(number)));
    } catch (Exception e) {
      System.err.println("Error: something went wrong");
      System.exit(0);
    }

    scanner.nextLine();

    try {
      System.out.print("Input a text: ");
      String text = scanner.nextLine();
      System.out.println("The text contains  " + Vowels.count(text).toString() + " vowels");
    } catch (Exception e) {
      System.err.println("Error: something went wrong");
      System.exit(0);
    }

    try {
      System.out.print("Input some numbers (separated by a coma): ");
      int[] numbers = Arrays.stream(scanner.nextLine().split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
      System.out.println("Biggest number: " + Numbers.biggest(numbers).toString());
    } catch (Exception e) {
      System.err.println("Error: something went wrong");
      System.exit(0);
    }
    scanner.close();
  }
}