/*Experiment 17: Print
    *
   * *
  * * *
 * * * *
* * * * * */

public class Exp17 {
  public static void main(String ar[]) {
    int n = 5; // Number of rows
    for (int i = 1; i <= n; i++) {
      for (int j = i; j < n; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
