import utils.Fibonacci;
import utils.Vowels;
import java.util.Scanner;
import java.util.Arrays;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Introduce un número: ");
      int number = scanner.nextInt();
      System.out.println(Arrays.toString(Fibonacci.generateSequence(number)));
    } catch (Exception e) {
      System.err.println("Error: algo salio mal");
    }

    try {
      System.out.print("Introduce un texto: ");
      scanner.nextLine();
      String text = scanner.nextLine();
      System.out.println("tiene " + Vowels.count(text).toString() + " vocales");
    } catch (Exception e) {
      System.err.println("Error: algo salio mal");
      System.exit(0);
    }
    scanner.close();
  }
}