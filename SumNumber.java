// Program to add two numbers and display the sum
import java.util.*;

class SumNumber
{
	public static void main(String[] ar)
	{
		int a,b,sum;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Number : ");
		a = sc.nextInt();
		System.out.print("Enter Second Number : ");
		b = sc.nextInt();
		
		sum = a + b;

		System.out.println("Sum of "+a+" and "+b+" is "+sum);
	}
}
