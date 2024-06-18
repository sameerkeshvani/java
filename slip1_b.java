import java.io.*;
class slip1_b
{
	public static void main(String arg[]) throws Exception
	{
		FileInputStream fis = new FileInputStream("a1.txt");
		FileOutputStream fos = new FileOutputStream("b1.txt");
		int ch;
		while((ch=fis.read())!=-1)
		{
			if(Character.isLetter(ch))
				fos.write(ch);
		}
	}
}