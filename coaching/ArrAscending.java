// Write a programme to input a number from command line argument in an array and arrange the array in ascending order.

class ArrAscending 
{
    public static void main(String arg[]) 
    {
        int arr[] = new int[5];
        int temp;

        for (int i = 0; i < 5; i++) 
        {
            arr[i] = Integer.parseInt(arg[i]);
        }

        for (int i = 0; i < 5; i++) 
        {
            for (int j = i + 1; j < 5; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in ascending order:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}