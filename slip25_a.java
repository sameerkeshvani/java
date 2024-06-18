import java.io.*;
class slip25_a
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String s = br.readLine();
		StringBuffer str = new StringBuffer(s);
		String rev = ""+str.reverse();
		if(s.equals(rev))
			System.out.println(""+s+" is a palindrome string");
		else
			System.out.println(""+s+" is not a palindrome string");
	}
}