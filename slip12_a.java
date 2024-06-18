import java.io.*;
class slip12_a
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of string");
		int n = Integer.parseInt(br.readLine());
		String s[] = new String[n];
		System.out.println("Enter string");
		for(int i=0;i<n;i++)
		{
			s[i] = br.readLine();
		}
		System.out.println("Reversed:");
		for(int i=0;i<n;i++)
		{
			StringBuffer str = new StringBuffer(s[i]);
			System.out.println(""+str.reverse());
		}
	}
}