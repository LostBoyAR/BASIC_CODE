// Experiment 13: Input two numbers and print tables of all numbers oIn range.

import java.util.*;

public class Exp13 {

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            for (int j = a; j <= b; j++) {
                System.out.print(j + " x " + i + " = " +(j * i) + "\t");
            }
            System.out.println();
        }
    }
}
