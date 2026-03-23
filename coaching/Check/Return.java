class ReturnValue 
{
    int sum()
    {
        int s, x=5, y=7;
        s = x + y;
        return s;
    }


    int great()
    {
        int x=5, y=7;
        if(x > y)
            return x;
        else
            return y;
    }

}

class Return
{
    public static void main(String arg[])
    {
        ReturnValue rv = new ReturnValue();
        int x, y;
        
        x = rv.sum();
        y = rv.great();

        System.out.println("Sum: " + x);
        System.out.println("Greater: " + y);
    }
}