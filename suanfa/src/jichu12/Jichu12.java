package jichu12;
import java.util.Scanner;
import java.math.BigInteger;
public class Jichu12{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		String s1 = sc.nextLine();
		int i1 = Integer.parseInt(sc.nextLine());
		BigInteger [] bg = new  BigInteger [i1];
		for(int temp = 0;temp < i1;temp++)
		{
			bg[temp] = new BigInteger(sc.nextLine(),16);
			
		}
		for(int temp = 0;temp < i1;temp++)
		{
		System.out.println(bg[temp].toString(8));
		}
	}
}





//import java.math.BigInteger;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int i1 = Integer.parseInt(sc.nextLine());
//		BigInteger [] zu = new BigInteger [i1];	
//		for(int temp = 0;temp<i1;temp++)
//		{
//			zu[temp] = new BigInteger(sc.nextLine(),16);	
//		}
//		for(int temp = 0;temp<i1;temp++)
//		{	
//			System.out.println(zu[temp].toString(8));
//		}
//	}
//}






//import java.math.BigInteger;
//import java.util.Scanner;
//public class Jichu12{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int i1 = Integer.parseInt(sc.nextLine());
//		BigInteger [] zu = new BigInteger [i1];	
//		for(int temp = 0;temp<i1;temp++)
//		{
//			zu[temp] = new BigInteger(sc.nextLine(),16);
//			
//		}
//		for(int temp = 0;temp<i1;temp++)
//		{	
//			System.out.println(zu[temp].toString(8));
//		}
//	}
//}



















//import java.util.Scanner;
//import java.util.Arrays;
//public class Jichu12 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s1 = sc.nextLine();
//		int i1 = Integer.parseInt(s1);
//		String [] zu2 = new String [i1];
//		String [] zu3 = new String [i1];
//		for(int temp = 0;temp<i1;temp++)
//		{
//			zu2 [temp] = sc.nextLine();
//			zu3 [temp] = Integer.toOctalString(Integer.valueOf(zu2[temp], 16));
//		}
//		for(int temp = 0;temp<i1;temp++)
//		{
//			System.out.println(zu3[temp]);
//		}
//	}
//}


/*
 *  		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int i1 = Integer.parseInt(s1);
		int [] zu = new int [i1];
		String [] zu2 = new String [i1];
		String [] zu3 = new String [i1];
		for(int temp = 0;temp<i1;temp++)
		{
			
//			System.out.println("temp:"+temp);
			zu2 [temp] = sc.nextLine();
//			System.out.println("zu2:"+zu2[temp]);
			zu3 [temp] = Integer.toOctalString(Integer.valueOf(zu2[temp], 16));
//			System.out.println("zu3:"+zu3[temp]);
			
		}
		System.out.println(Arrays.toString(zu3));
//		String [] zu3 = new String [i1];
//		System.out.println("???");
//		Integer.toOctalString(Integer.valueOf("FFFF",16));
//		
//		System.out.println("???");
 *
 */
