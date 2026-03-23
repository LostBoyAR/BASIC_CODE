// Write a programme to input a number from command line argument and check it is a Armstrong number or not.

class Armstrong 
{
    public static void main(String arg[]) 
    {
        int n = Integer.parseInt(arg[0]);
        int rem, sum = 0, temp;
        int digits = 0;

        temp = n;
        while (n > 0) 
        {
            n = n / 10;
            digits++;
        }
        n = temp;
        while (n > 0) 
        {
            rem = n % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) 
            {
                power *= rem;
            }
            sum += power;
            n = n / 10;
        }
        if (temp == sum) 
        {
            System.out.println(temp + " is an Armstrong number.");
        } 
        else 
        {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
