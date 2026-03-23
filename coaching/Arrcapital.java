// wap to convert an inputted string in capital letters.

import java.util.Scanner;
class Arrcapital 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String name = sc.next();
        String name2 = "";
        char ch[] = name.toCharArray();
        for (char c : ch) 
        {
            if (c >= 'A' && c <= 'Z') 
            {
                name2 += c;
            }
            else if (c >= 'a' && c <= 'z')
            {
                c = (char)(c - 32);
                name2 += c;
            }
        }
        System.out.println(name2);
    }
}






