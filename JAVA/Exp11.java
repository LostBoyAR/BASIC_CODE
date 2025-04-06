
// Experiment 11: Write a programme to input values of different data types using Scanner class methods
import java.util.Scanner;

public class Exp11 {
  public static void main(String ar[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a byte value: ");
    byte b = sc.nextByte();
    System.out.print("Enter a short value: ");
    short sh = sc.nextShort();
    System.out.print("Enter an integer value: ");
    int n = sc.nextInt();
    System.out.print("Enter a long value: ");
    long l = sc.nextLong();
    System.out.print("Enter a float value: ");
    float f = sc.nextFloat();
    System.out.print("Enter a double value: ");
    double d = sc.nextDouble();
    System.out.print("Enter a boolean value (true/false): ");
    boolean bool = sc.nextBoolean();
    System.out.print("Enter a string value: ");
    String s = sc.next();
    System.out.println("Byte: " + b + "\nShort: " + sh + "\nInteger: " + n + "\nLong: " + l + "\nFloat: " + f + "\nDouble: " + d + "\nBoolean: " + bool + "\nString: " + s);
  }
}
