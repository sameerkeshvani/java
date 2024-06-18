import java.io.*;
class slip10_a
{
	public static void main(String arg[]) throws Exception
	{
		String s = "samosa";
		char ssize[] = new char[s.length()];
		int find = 0;
		for(int i=0;i<s.length();i++)
		{
			ssize[i]=s.charAt(i);
		}
		int n=0;
		for(int j=0;j<s.length();j++)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ssize[j]==ssize[i])
				{
					find++;
				}
			}
			System.out.println("The occurence of "+ssize[j]+" is "+find);
			find = 0;
		}
	}
}