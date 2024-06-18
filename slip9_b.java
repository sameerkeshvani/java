import java.io.*;
class invalid extends Exception
{
	invalid(String msg)
	{
		super(msg);
	}
}
class slip9_b
{
	public static void main(String arg[]) throws Exception
	{
		String preg = "[A-Z]{4}[0-9]{5}[A-Z]";
		String mreg = "[0-9]{10}";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter PAN Number:");
		String pan = br.readLine();
		System.out.println("Enter Mobile Number:");
		String mob = br.readLine();
		try
		{
		if(pan.matches(preg) && mob.matches(mreg))
		{
			System.out.println("Pan Number:"+pan);
			System.out.println("Mobile Number:"+mob);
		}
		else
		{
			throw new invalid("Invalid Data");
		}
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
	}
}