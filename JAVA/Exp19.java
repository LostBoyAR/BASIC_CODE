// Experiment 19: Get two numbers from user input then print all odd numbers then print all even numbers.

import java.util.*;

public class Exp19 {
  public static void main(String ar[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int start = sc.nextInt();
    System.out.print("Enter the second number: ");
    int end = sc.nextInt();

    System.out.println("Odd numbers between " + start + " and " + end + " are:");
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }

    System.out.println("Even numbers between " + start + " and " + end + " are:");
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}