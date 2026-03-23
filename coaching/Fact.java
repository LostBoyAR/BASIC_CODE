// Write a programme to input a number from command line argument and print its factorial.

class Fact 
{
    public static void main(String arg[]) 
    {
        int num = Integer.parseInt(arg[0]);
        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " + fact);
    }
}