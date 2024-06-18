import java.io.*;
class slip15_a
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of ArrayString");
		int n = Integer.parseInt(br.readLine());
		String s[] = new String[n];
		System.out.println("Enter string");
		for(int i=0;i<n;i++)
		{
			s[i]=br.readLine();
		}
		System.out.println("Enter String to be searched");
		String search = br.readLine();
		int si =1;
		for(int i=0;i<n;i++)
		{
			if(s[i].matches(search))
			{
				System.out.println(""+search+" found at "+i+" indexed value");
				si = 0;
			}
		}
		if(si==1)
		{
			System.out.println("Not Found");
		}
	}
}