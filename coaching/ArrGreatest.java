// Write a programme to input a number from command line argument in an array and print the greatest number.

class ArrGreatest 
{
    public static void main(String arg[]) 
    {
        int arr[] = new int[5];
        int greatest;

        for (int i = 0; i < 5; i++) 
        {
            arr[i] = Integer.parseInt(arg[i]);
        }

        greatest = arr[0];

        for (int i = 1; i < 5; i++) 
        {
            if (arr[i] > greatest) 
            {
                greatest = arr[i];
            }
        }

        System.out.println("The greatest number is: " + greatest);
    }
}
