class A 
{
    int great(int a[]) 
    {
        int g = a[0];
        for (int x = 0; x < a.length; x++)
            if (g < a[x]) 
                g = a[x];
        return g;
    }
}

class ReturnParameter 
{
    public static void main(String arg[]) 
    {
        int arr[] = {5, 7, 3, 10, 20};
        
        A a = new A();
        int x;
        x = a.great(arr);

        System.out.println("Greatest: " + x);
    }
}