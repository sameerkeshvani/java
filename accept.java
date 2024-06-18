import java.io.*;
class accept
{
	public static void main(String arg[]) throws Exception
	{
		System.out.println("Enter your name:");
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println(""+name+", how are you ?");
	}
}


