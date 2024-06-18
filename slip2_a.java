import java.io.*;
class vowel
{
	void vowel1(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				System.out.println(""+str.charAt(i));
			}
		}
	}
}
class slip2_a
{
	public static void main(String arg[]) throws Exception
	{
		vowel v = new vowel();
		v.vowel1("sameer");
	}
}