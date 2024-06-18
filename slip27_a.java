import java.io.*;
class rangeexception extends Exception
{
	rangeexception(String msg)
	{
		super(msg);
	}
}
class getdata
{
	static void get()
	{
	try
	{
		System.out.println("Enter a number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		if(num > 1000)
		{
			throw new rangeexception("Number is out of range");
		}
		else
		{
			System.out.println("Factorials:");
			for(int i=1;i<=1000;i++)
			{
				if(num%i == 0)
				{
					System.out.println(""+i);
				}
			}
		}
	}
	catch(Exception e)
	{
		System.out.println(""+e);
	}
	}
}
class slip27_a
{
	public static void main(String arg[]) throws Exception
	{
		getdata.get();
	}
}