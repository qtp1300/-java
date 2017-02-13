package test001;
import java.util.Scanner;
public class Test002 {

	public static void main(String[] args) {
							//		// TODO Auto-generated method stub
							//		Scanner sc = new Scanner(System.in);
							//		String s = sc.nextLine();
							//		int  c = s.length();
							//		int  i = Integer.parseInt(s);
							////		double d = Math.pow(10,c);
							////		i = (int) (i*d);
							////		System.out.println(c);
							////		System.out.println(i);
							//		int n;
							//		for(n=c;n>1;n--)
							//		{
							//			
							//		}
							//		
							//	
		Scanner sc = new Scanner(System.in);
		String s2 = sc.nextLine();
		int s3 = Integer.parseInt(s2);
		int [] zu = new int [s3+1];
		int temp = 1;
		for(;temp<=s3;temp++)
		{
		int  s = sc.nextInt();
		zu[temp] = s;
//		System.out.println("¼ì²éµã3 "+zu[temp]);
		}
		System.out.println("complete");
		char n= 0;
		for(n=1;n<=s3;n++)
		{
		System.out.print(zu[n]+" ");
//		System.out.println("???");
		
		}
		System.out.println("  ");
		System.out.print(zu[1]);
		System.out.print(zu[2]);
		System.out.print(zu[3]);
		System.out.print(zu[4]);
		System.out.print(zu[5]);
		
		
	
	}

}
