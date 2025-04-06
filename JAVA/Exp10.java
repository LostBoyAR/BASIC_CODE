
// Experiment 10: Write a programme in java to input a number then print table of given number.

public class Exp10 {
    public static void main(String ar[]) {
      int n = Integer.parseInt(ar[0]);
      for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
      }
    }
  }