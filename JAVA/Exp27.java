import java.util.*;

public class Exp27 
{
    public static void main(String ar[]) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][5];
        System.out.println("Enter 10 different number: ");
        for(int k = 0; k < 2; k++)
        {
            for(int i = 0; i < 5; i++)
            {
                arr[k][i] = sc.nextInt();
            }
            System.out.println();
        }
        for (int ele[]: arr) 
        {
            for (int v: ele) 
            {
                System.out.print(v + " ");   
            }
            System.out.println();
        }
    }
}