// Experiment 8: Write a programme to input numbers using Command line parameter then print the larger number.

public class Exp08 {
    public static void main(String ar[]) {
      int a = Integer.parseInt(ar[0]);
      int b = Integer.parseInt(ar[1]);
      if (a > b) {
        System.out.println(a + " is greater than " + b);
      } else if (a < b) {
        System.out.println(b + " is greater than " + a);
      } else {
        System.out.println(a + " is equal to " + b);
      }
    }
  }
