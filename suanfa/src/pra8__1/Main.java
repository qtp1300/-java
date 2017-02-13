package pra8__1;

import java.util.Scanner;

public class Main {
	static int N,N1,N2,N3;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String shu = s.nextLine();
		N=Integer.parseInt(shu);
		N3=1;
		N2=N;
		zuida(N);
		for(;N2>0;N2--)
		{
			zuida(N2);		
		}
		System.out.print(N3);
	}
	static void zuida(int N)
	{
		for(;N!=1;)
		{
		N1=N%2;

		if(N1==0)			//Å¼Êý
		{
			N=N/2;
		}
		if(N1==1)			//ÆæÊý
		{
			N=N*3+1;
		}
		if(N>N3)
		{
			N3=N;
		}
		}
	}
}
