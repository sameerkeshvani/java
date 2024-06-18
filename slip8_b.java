import java.io.*;
class slip8_b
{
	public static void main(String arg[]) throws Exception
	{
		File f = new File("C:\\Users\\samee\\Desktop\\Java\\");
		String list[] = f.list();
		for(int i=0;i<list.length-1;i++)
		{
			if(list[i].endsWith(".txt"))
			{
				System.out.println(""+list[i]);
			}
		}
	}
}