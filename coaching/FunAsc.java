// WAP to pass an array in method and arrange it in ascending order. 

import java.util.Scanner;  

class FunAsc  
{  
    void arrAsc(int arr[])  
    {  
        int temp = 0;  
        for(int i=0; i < 5; i++)  
        {  
            for(int j=i+1; j < 5; j++)  
            {  
                if(arr[i] > arr[j])  
                {    
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
    }  
    
    static void show(int arr[])  
    {  
        System.out.println("Sorted array in ascending order: ");  
        for(int i=0; i < 5; i++)  
        {  
            System.out.print(arr[i] + " ");  
        }  
    }  
    
    public static void main(String args[])  
    {  
        FunAsc obj = new FunAsc();  
        Scanner sc = new Scanner(System.in);  

        int arr[] = new int[5];
        
        System.out.println("Enter 5 values for the arranging in ascending order: ");  
          
        for(int i=0; i < 5; i++)  
        {  
            arr[i] = sc.nextInt();  
        }  

        obj.arrAsc(arr);  
        show(arr);  
    }  
}
