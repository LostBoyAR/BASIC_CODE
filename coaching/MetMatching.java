// WAP to pass 2 strings in a method as parameter and return true if they are same otherwise false.

import java.util.Scanner;

class MetMatching  
{  
    static boolean match(String s1, String s2)  
    {  
        return s1.equals(s2);  
    }  
    
    public static void main(String args[])  
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        boolean result = match(str1, str2);  
        if(result) {
            System.out.println("The strings are same.");
        } else {
            System.out.println("The strings are different.");
        }
    }  
}
