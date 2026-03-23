// class Check
// {
//     static
//     {
//         System.out.println("This is static.");
//     }
//     public static void main(String arg[])
//     {
//         Check c = new Check();
//     }
// }

// class Check
// {
//     void show()
//     {
//         System.out.println("show method.");
//     }

//     static void display()
//     {
//         System.out.println("Static display method.");
//     }

//     static
//     {
//         System.out.println("This is static.");
//     }
//     public static void main(String arg[])
//     {
//         Check c = new Check();

//         c.show();

//         display();
//     }
// }


class Check
{
    void sum(int x, int y, String s)
    {
        int st = x + y;
        System.out.println("Sum = " + st);

        System.out.println(s);
    }
    public static void main(String arg[])
    {
        Check c = new Check();
        c.sum(5, 10, "Hello");
    }
}