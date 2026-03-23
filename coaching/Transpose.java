// Write a programme to input 9 numbers in 2D an array and print the transpose of the numbers.

import java.util.Scanner;

class Transpose 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];
        int transpose[][] = new int[3][3];

        System.out.println("Enter 9 numbers for 3x3 matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                transpose[i][j] = arr[j][i];
            }
        }

        System.out.println("Transpose Matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}