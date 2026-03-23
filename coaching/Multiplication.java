// Write a programme to input 9 numbers in 2D two array and perform matrix multiplication and print the a.

import java.util.Scanner;

class Multiplication 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int a[][] = new int[3][3];

        System.out.println("Enter 9 numbers for first 3x3 matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter 9 numbers for second 3x3 matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("First Matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // Perform matrix multiplication
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                a[i][j] = 0;
                for (int k = 0; k < 3; k++) 
                {
                    a[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Multiplication Matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}