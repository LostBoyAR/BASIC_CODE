
// Write a programme to input a number from command line argument in an array and print the sum of all numbers.

class ArrSum 
{
    public static void main(String arg[]) 
    {
        int arr[] = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) 
        {
            arr[i] = Integer.parseInt(arg[i]);
        }

        for (int i = 0; i < 5; i++) 
        {
            sum += arr[i];
        }

        System.out.println("The sum of all numbers is: " + sum);
    }
}

