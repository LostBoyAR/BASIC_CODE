// Write a programme to input a number from command line argument and check it is palindrome or not.

class Palindrome 
{
    public static void main(String arg[]) 
    {
        int n = Integer.parseInt(arg[0]);
        int rem, sum = 0, temp;

        temp = n;
        while (n > 0) 
        {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }

        if (temp == sum) 
        {
            System.out.println(temp + " is a palindrome number.");
        } 
        else 
        {
            System.out.println(temp + " is not a palindrome number.");
        }
    }
}