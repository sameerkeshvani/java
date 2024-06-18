import java.io.*;
class cricketplayers
{
	int pid,totalRuns,inningsplayed,notouttimes,outtimes,average;
	String pname;
	void acceptcalavg() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the following details:");
		System.out.print("Player id :");
		pid = Integer.parseInt(br.readLine());
		System.out.print("Player name :");
		pname = br.readLine();
		System.out.print("Player total runs :");
		totalRuns = Integer.parseInt(br.readLine());
		System.out.print("Player innings played :");
		inningsplayed = Integer.parseInt(br.readLine());
		System.out.print("Player not out times :");
		notouttimes = Integer.parseInt(br.readLine());
		outtimes = inningsplayed - notouttimes;
		average = totalRuns/outtimes;
	}
	void displayaverage()
	{
		System.out.println("Average of "+pname+" is "+average);
	}
	static void highavg(cricketplayers cp[], int n)
	{
		for(int i=0;i<n;++i)
		{
			if(cp[0].average<cp[i].average)
			{
				int temp=cp[0].average;
				cp[0].average = cp[i].average;
				cp[i].average = temp;
				System.out.println("Highest Average is "+cp[0].average);
			}
		}
	}
}
class slip7_b
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many cricket players details you want to enter ?");
		int n = Integer.parseInt(br.readLine());
		cricketplayers cp[] = new cricketplayers[n];
		for(int i=0;i<n;i++)
		{
			cp[i] = new cricketplayers();
		}
		for(int i=0;i<n;i++)
		{
			cp[i].acceptcalavg();
		}
		for(int i=0;i<n;i++)
		{
			cp[i].displayaverage();
		}
		cricketplayers.highavg(cp,n);
	}
}