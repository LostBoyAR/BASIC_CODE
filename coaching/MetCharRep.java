// WAP to pass a char array in a method as parameter and return how many characters are repeated in that array.

import java.util.Scanner;

class MetCharRep  
{  
    static int repeated(char ar[])  
    {  
        char ch[] = new char[ar.length];
        int c1 = 0, c2 = 0, m = 0;

        for (int i = 0; i < ar.length - 1; i++) 
        {
            c2 = 0;
            for(int k = 0; k < ch.length; k++) 
            {
                if (ar[i] == ch[k]) 
                {
                    continue;
                }
            }
            for (int j = i + 1; j < ar.length; j++) 
            {
                if (ar[i] == ar[j]) 
                {
                    c2++;
                    ch[m] = ar[i];
                    m++;
                    break;
                }
            } 
            if(c2 > 0) 
            {
                c1++;
            }
        }
        return c1;
    }
                
    
    public static void main(String args[])  
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();

        int z = repeated(ch);
        System.out.println("Number of repeated characters: " + z);
    }  
}
