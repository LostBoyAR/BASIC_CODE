// Write a programme to input a number from command line argument and check it is prime or not.

// class Prime {
//     public static void main(String arg[]) {
//         int i = Integer.parseInt(arg[0]);
//         boolean isPrime = true;

//         if (i <= 1) {
//             isPrime = false;
//         } else {
//             for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime) {
//             System.out.println(i + " is a prime number.");
//         } else {
//             System.out.println(i + " is not a prime number.");
//         }
//     }
// }

// Write a programme to print prime number from 1 to 100.

class Prime 
{
    public static void main(String arg[]) 
    {
        System.out.println("Prime numbers from 1 to 100 are:");

        for (int i = 2; i <= 100; i++) 
        {
            int c = 0;

            for (int j = 2; j <= i/2; j++) 
            {
                if (i % j == 0) 
                {
                    c++;
                    break;
                }
            }

            if (c == 0) 
            {
                System.out.print(i + " ");
            }
        }
    }
}