// Write a programme to pass a value from command line argument and print a table.

class Table
{
    public static void main(String arg[])
    {
        int num = Integer.parseInt(arg[0]);

        System.out.println("Table of " + num + ":");
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
