// WAP to sum , using recursion.


// class RecSum 
// {
//     static int sum(int ar[], int n) 
//     {
//         n--;
//         if (n == 0)
//             return 0;
//         else
//             return sum(ar, n) + ar[n];
//     }

//     public static void main(String arg[]) 
//     {
//         int arr[] = {1, 2, 3, 4, 5};

//         int s = sum(arr, arr.length);
//         System.out.println("Sum = " + s);
//     }
// }

class RecSum 
{
    static int sum(int ar[], int n) 
    {
        n--;
        if (n <= 0)
            return ar[0];
        else
            return sum(ar, n) + ar[n];
    }

    public static void main(String arg[]) 
    {
        int arr[] = {1, 2, 3, 4, 5};

        int s = sum(arr, arr.length);
        System.out.println("Sum = " + s);
    }
}