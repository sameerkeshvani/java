import java.io.*;
class zeroexception extends Exception
{
	zeroexception(String msg)
	{
		super(msg);
	}
}
class getdata
{
	static void get()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter any number");
			int num = Integer.parseInt(br.readLine());
			if(num==0)
			{
				throw new zeroexception("Number Is Zero");
			}
			else
			{
				String s = ""+num;
				int n1 =Integer.parseInt(""+s.charAt(0));
				int n2 = Integer.parseInt(""+s.charAt(s.length()-1));
				int n3 = n1+n2;
				System.out.println("Sum of first and last digit is "+n3);
			}
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
	}
}
class slip6_a
{
	public static void main(String arg[]) throws Exception
	{
		getdata g = new getdata();
		g.get();
	}
}
