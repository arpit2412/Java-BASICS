import java.io.*;
class DigitSum
{
	public static void main(String args[])
	{
		int a,n,sum=0;
		Console con=System.console();
		System.out.print("enter a number:");
		n=Integer.parseInt(con.readLine());
		while(n>0)
		{
			a=n%10;
			sum=sum+a;
			n=n/10;
		}
		System.out.print("sum is: "+sum);
	}	
}