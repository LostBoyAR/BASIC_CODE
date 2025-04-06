
// Experiment 12: Write a programme input values using Scanner, create user’s choice Menu to perform all arithmetical operations
import java.util.Scanner;

public class Exp12 {
  public static void main(String ar[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Remainder \nEnter your choice form 1 to 5: ");
    int choice = sc.nextInt();
    if (choice < 1 || choice > 5) {
      System.out.println("Invalid choice.");
      return;
    } else {
      System.out.print("Enter first number: ");
      int a = sc.nextInt();
      System.out.print("Enter second number: ");
      int b = sc.nextInt();

      if (choice == 1) {
        System.out.println("Addition: " + (a + b));
      } else if (choice == 2) {
        System.out.println("Subtraction: " + (a - b));
      } else if (choice == 3) {
        System.out.println("Multiplication: " + (a * b));
      } else if (choice == 4) {
        if (b == 0) {
          System.out.println("Division by zero is not allowed.");
        } else {
          System.out.println("Division: " + (a / b));
        }
      } else if (choice == 5) {
        System.out.println("Remainder: " + (a % b));
      }
    }
  }
}
