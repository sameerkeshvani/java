import java.io.*;
class slip16_b
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many names you want to enter ?");
		int n = Integer.parseInt(br.readLine());
		String s[] = new String[n];
		System.out.println("Enter names");
		for(int i=0;i<n;i++)
		{
			s[i] = br.readLine();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(s[j].compareTo(s[i])<0)
				{
					String temp = s[j];
					s[j] = s[i];
					s[i] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(""+s[i]);
		}
	}
}