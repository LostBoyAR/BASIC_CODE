// class Pattern 
// {
//     public static void main(String arg[])
//     {
//         for(int i = 1; i <= 5; i++) 
//         {
//             for(int j = 5; j >= i; j--) 
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     } 
// }


// class Pattern 
// {
//     public static void main(String arg[])
//     {
//         for(int i = 1; i <= 5; i++) 
//         {
//             for(int j = 1; j < i; j++) 
//             {
//                 System.out.print("  ");
//             }
//             for(int k = 5; k >= i; k--) 
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     } 
// } 


// class Pattern 
// {
//     public static void main(String arg[])
//     {
//         for(int i = 1; i <= 5; i++) 
//         {
//             for(int j = 5; j > i; j--) 
//             {
//                 System.out.print("  ");
//             }
//             for(int k = 1; k <= (2*i - 1); k++) 
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     } 
// }


// class Pattern 
// {
//     public static void main(String arg[])
//     {
//         for(int i = 1; i <= 5; i++) 
//         {
//             for(int j = 5; j > i; j--) 
//             {
//                 System.out.print("  ");
//             }
//             int num = i;
//             for(int k = 1; k <= (2*i - 1); k++) 
//             {
//                 System.out.print(num + " ");
//                 if(k < i)
//                     num++;
//                 else
//                     num--;
//             }
//             System.out.println();
//         }
//     } 
// }


// class Pattern 
// {
//     public static void main(String arg[])
//     {
//         for(int i = 1; i <= 5; i++) 
//         {
//             for(int j = 5; j > i; j--) 
//             {
//                 System.out.print("  ");
//             }
//             for(int k = 1; k <= i; k++) 
//             {
//                 System.out.print("* ");
//             }
//             for(int l = 2; l <= i; l++) 
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     } 
// }

//     1
//    232
//   34543
//  4567654
// 567898765


// class Pattern 
// {
//     public static void main(String arg[])
//     {
//         int m = 0;
//         for(int i = 1; i <= 5; i++) 
//         {
//             for(int j = 5; j > i; j--) 
//             {
//                 System.out.print("  ");
//             }
//             for(int k = i; k <= m + i; k++) 
//             {
//                 System.out.print(k + " ");
//             }
//             for(int l = m + i - 1; l >= i; l--)
//             {
//                 System.out.print(l + " ");
//             }
//             m++;
//             System.out.println();
//         }
//     } 
// } 

// 123454321
// 1234 4321
// 123   321
// 12     21
// 1       1

class Pattern 
{
    public static void main(String arg[])
    {
        int n = -1;
        int m = 5;
        for(int i = 1; i <= 5; i++) 
        {
            for(int j = 1; j <= m; j++) 
            {
                System.out.print(j);
            }
            for(int k = 1; k <= n; k++) 
            {
                System.out.print(" ");
            }
            n += 2;
            for(int l = m; l >= 1; l--) 
            {
                if (m == 5 && l == 5);
                else
                {
                    System.out.print(l);
                }
            }
            m--;
            System.out.println();
        }
        
    } 
}