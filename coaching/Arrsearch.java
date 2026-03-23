// Write a programme to store 5 names in an array and input a name from user and search the inputted name in that array.

// import java.util.Scanner;
// class Arrsearch 
// {
//     public static void main(String arg[]) 
//     {
//         Scanner sc = new Scanner(System.in);

//         String names[] = {"Raja", "Aditya", "Piyush", "Rudra", "Ayush"};

//         System.out.println("Enter a name to search:");
//         String search = sc.next();

//         boolean found = false;
//         for (int i = 0; i < 5; i++)
//         {
//             if (names[i].equals(search))
//             {
//                 found = true;
//                 break;
//             }
//         }

//         if (found)
//         {
//             System.out.println(search + " is found");
//         }
//         else
//         {
//             System.out.println(search + " is not found");
//         }
//     }
// }

import java.util.Scanner;
class Arrsearch 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        String names[] = {"Raja", "Aditya", "Piyush", "Rudra", "Ayush"};

        System.out.println("Enter a name to search:");
        String search = sc.next();

        boolean found = false;
        for (int i = 0; i < 5; i++)
        {
            if (names[i].equalsIgnoreCase(search))
            {
                found = true;
                break;
            }
        }

        if (found)
        {
            System.out.println(search + " is found");
        }
        else
        {
            System.out.println(search + " is not found");
        }
    }
}