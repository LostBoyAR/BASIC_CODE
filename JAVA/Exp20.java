// Experiment 20: Print all Prime Numbers between 1 to n using while-loop.

import java.util.Scanner;

public class Exp20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();

    System.out.println("Prime numbers between 1 and " + n + " are:");
    int i = 2;
    while (i <= n) {
      if (isPrime(i)) {
        System.out.println(i);
      }
      i++;
    }
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    int i = 2;
    while (i <= Math.sqrt(num)) {
      if (num % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }
}
