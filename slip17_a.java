import java.io.*;
class slip17_a
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many numbers you want to enter");
		int n = Integer.parseInt(br.readLine());
		int num[] = new int[n];
		int ar[] = new int[n];
		int count=0;
		System.out.println("Enter numbers");
		for(int i=0;i<n;i++)
		{
			num[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<n;i++)
		{
			int num1=num[i];
			int sum=0;
			while(num[i]>0)
			{
				int rem=num[i]%10;
				int cube=rem*rem*rem;
				num[i]=num[i]/10;
				sum=sum+cube;
			}
			if(num1==sum)
			{
				ar[i]=num1;
				count++;
			}
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(""+ar[i]);
		}
	}
}
