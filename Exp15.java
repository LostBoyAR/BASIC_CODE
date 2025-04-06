// Experiment 15: Write a programme to print the sum of natural numbers .

import java.util.*;

public class Exp15 {

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of " + n + " natural numbers is " + sum);
    }
}
