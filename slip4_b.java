import java.io.*;
class slip4_b
{
	public static void main(String arg[]) throws Exception
	{
		File f = new File("C:\\Users\\samee\\Documents\\My Computer\\Java");
		String list[] = f.list();
		for(int i=0;i<list.length;i++)
		{
			//File fd = new File("C:\\Users\\samee\\Desktop\\Java"+list[i]);
			if(list[i].endsWith(".txt"))
			{
				f.delete();
			}
			else
			{
				System.out.println("File Name:"+list[i]);
				System.out.println("File Path:"+f.getAbsolutePath());
				System.out.println("File Size:"+f.length());
			}
		}
	}
}