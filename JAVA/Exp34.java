import java.util.*;

class Add
{
    public void add(int x, int y)
    {
        int sum = x + y;
        System.out.println("Add = " + sum);
    }
}
public class Exp34 
{
    public static void main(String ar[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Add myobj = new Add();
        myobj.add(a, b);
    }   
}
