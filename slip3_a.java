import java.io.*;
class armstrong
{
	static void armstrong1(int number)
	{
		int temp = number;
		int rem,sqr,sum=0;
		while(number>0)
		{
			rem = number % 10;
			sqr = rem * rem * rem;
			sum = sum + sqr;
			number = number / 10;
		}
		if(sum == temp)
		{
			System.out.println(""+temp+" is an armstrong number");
		}
		else
		{
			System.out.println(""+temp+" is not an armstrong number");
		}
	}
}
class slip3_a
{
	public static void main(String arg[]) throws Exception
	{
		armstrong.armstrong1(153);
	}
}