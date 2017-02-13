package jichu13;

import java.util.Arrays;
import java.util.Scanner;
public class Jichu13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int i1 = Integer.parseInt(s1);
		int [] zu = new int [i1];
		for(int temp = 0;temp<i1;temp++)
		{
			int  s = sc.nextInt();
			zu[temp] = s;
	//		System.out.println("检查点3 "+zu[temp]);
		}
		Arrays.sort(zu);
		for(int tem = 0;tem<i1;tem++)
		{
			System.out.print(zu[tem]+" ");
			
		}
//		System.out.println(Arrays.toString(zu));  //直接将数组输出
		System.out.println("完成");
	}
}
/*for 循环一个个将字符串转变为数组，while循环比较，需要换就交换并清除标志位，不需要交换就标志位biao加一，
若标志位等于输入字符串长度则代表已完成排序，输出结果。
中间用temp存储交换的数值*/



//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s1 = sc.nextLine();
//		int i1 = Integer.parseInt(s1);
//		int [] zu = new int [i1];
//		for(int temp = 0;temp<i1;temp++)
//		{
//			int  s = sc.nextInt();
//			zu[temp] = s;
//		}
//		int biao = 0;
//		while(biao<i1)
//		{
//			for(char n=0;n<i1-1;n++)
//			{
//				if(zu[n]>zu[n+1])
//				{
//					int temp1 = zu[n];
//					zu[n] = zu[n+1];
//					zu[n+1] = temp1;
//					biao = 0;
//				}
//				else
//				{
//					biao++;
//				}
//			}
//		}
//		for(int tem = 0;tem<i1;tem++)
//		{
//			System.out.print(zu[tem]+" ");
//		}
//	}
//}

/*
package jichu1;
import java.util.Scanner;
public class Jichi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int i1 = Integer.parseInt(s1);
		int [] zu = new int [i1];
		for(int temp = 0;temp<i1;temp++)
		{
			int  s = sc.nextInt();
			zu[temp] = s;
	//		System.out.println("检查点3 "+zu[temp]);
		}
		System.out.println("complete");
		int biao = 0;
		while(biao<i1)
		{
			for(char n=0;n<i1-1;n++)
			{
	//			System.out.print(zu[n]+" ");
				if(zu[n]>zu[n+1])
				{
					int temp1 = zu[n];
					zu[n] = zu[n+1];
					zu[n+1] = temp1;
					biao = 0;
				}
				else
				{
					biao++;
				}
				
			}
		}
		for(int tem = 0;tem<i1;tem++)
		{
			System.out.print(zu[tem]+" ");
			
		}
		System.out.println("完成");
	}
}
*/
