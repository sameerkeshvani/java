import java.io.*;
class slip4_a
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string:");
		String str = br.readLine();
		for(int i=0;i<str.length();i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(""+str.charAt(i));
			}
		}
	}
}