package zhenti2;
import java.util.Scanner;
public class Zhenti2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int h = i1*4+5;
		int s = i1*4+5;
		String [][] s1 = new String [h][s];	
		for(int temp = 0;temp<h;temp++)
		{
				
			for(int temp1 = 0;temp1<s;temp1++)
			{
				s1[temp][temp1] = "$";
			}
			switch (temp)
			{
			case 0 :
				s1[0][0] = ".";
				s1[0][1] = ".";
				s1[0][s-1] = ".";
				s1[0][s-2] = ".";
				break;
			case  :
			}
		}
//		for(int temp = 0;temp<h;temp++)
//			{
//				for(int temp1 = 0;temp1<s;temp1++)
//				{
//					s1[temp][temp1] = "$";
//				}
//			}
//		s1[0][0] = ".";s1[0][1] = ".";s1[1][0] = ".";s1[1][1] = ".";
		for(int temp = 0;temp<h;temp++)
		{
			for(int temp1 = 0;temp1<s;temp1++)
			{
				System.out.print(s1[temp][temp1]);
			}
			System.out.println();
		}
	}
}
