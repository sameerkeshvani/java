import java.io.*;
class slip9_a
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("0\t");
				}
				else
				{
					System.out.print("1\t");
				}
			}
			System.out.print("\n");
		}
	}
}