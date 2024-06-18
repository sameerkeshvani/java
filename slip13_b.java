import java.io.*;
class slip13_b
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String s = br.readLine();
		String S = s.toUpperCase();
		System.out.println("Hello, "+S+" ,nice to meet you!");
	}
}