import java.io.*;
class slip11_a
{
	public static void main(String arg[]) throws Exception
	{
		while(true)
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Choose your option");
			System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
			int n = Integer.parseInt(br.readLine());
			switch(n)
			{
				case 1: System.out.println("Enter any 2 numbers");
						int a = Integer.parseInt(br.readLine());
						int b = Integer.parseInt(br.readLine());
						int c = a+b;
						System.out.println("Addition: "+c);
						break;
				case 2: System.out.println("Enter any 2 numbers");
						a = Integer.parseInt(br.readLine());
						b = Integer.parseInt(br.readLine());
						c = a-b;
						System.out.println("Subtraction: "+c);
						break;
				case 3: System.out.println("Enter any 2 numbers");
						a = Integer.parseInt(br.readLine());
						b = Integer.parseInt(br.readLine());
						c = a*b;
						System.out.println("Multiplication: "+c);
						break;
				case 4: System.out.println("Enter any 2 numbers");
						a = Integer.parseInt(br.readLine());
						b = Integer.parseInt(br.readLine());
						c = a/b;
						System.out.println("Division: "+c);
						break;
				case 5: System.exit(0);
				default: System.out.println("Enter valid option");
			}
		}
	}
}