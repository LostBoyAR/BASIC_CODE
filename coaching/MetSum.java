// WAP to pass an arr into a method and return the sum of all values, use for-each loop.

import java.util.Scanner;

class A 
{  
    static int sum(int ar[])  
    {  
        int s = 0;  
        for(int num : ar)  
        {  
            s += num;  
        }  
        return s;  
    }  
}
    
class MetSum  
{    
    public static void main(String args[])  
    {   
        Scanner sc = new Scanner(System.in);
        A a = new A();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " values:");
        for(int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        
        int z = a.sum(arr);  
        System.out.println("Sum of " + n + " values are " + z);  
    }  
}
