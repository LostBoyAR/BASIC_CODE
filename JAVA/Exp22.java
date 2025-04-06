// Experiment 22: Write a programme to get a number then print reverse of given number.

import java.util.Scanner;

public class Exp22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int reverse = 0;

    while (number != 0) {
      int digit = number % 10;
      reverse = reverse * 10 + digit;
      number /= 10;
    }

    System.out.println("Reverse of the given number: " + reverse);
  }
}