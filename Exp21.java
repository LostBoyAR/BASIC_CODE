// Experiment 21: Print the sum of all digits of a number. 
// Ex:- Input :  123 
// Output:  6

import java.util.Scanner;

public class Exp21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int sum = 0;

    while (number != 0) {
      sum += number % 10;
      number /= 10;
    }

    System.out.println("Sum of all digits: " + sum);
  }
}
