// Experiment 18: Get two numbers from user input and print all prime numbers in range.

import java.util.*;

public class Exp18 {
  public static void main(String ar[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int start = sc.nextInt();
    System.out.print("Enter the second number: ");
    int end = sc.nextInt();

    System.out.println("Prime numbers between " + start + " and " + end + " are:");
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}

