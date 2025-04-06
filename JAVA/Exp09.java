// Experiment 9: Write a programme input values using Command Line Arguments and check that the number is even or odd

public class Exp09 {
    public static void main(String ar[]) {
      int n = Integer.parseInt(ar[0]);
      if (n % 2 == 0) {
        System.out.println(n + " is an even number.");
      } else {
        System.out.println(n + " is an odd number.");
      }
    }
  }
