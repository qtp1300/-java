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
	//		System.out.println("����3 "+zu[temp]);
		}
		Arrays.sort(zu);
		for(int tem = 0;tem<i1;tem++)
		{
			System.out.print(zu[tem]+" ");
			
		}
//		System.out.println(Arrays.toString(zu));  //ֱ�ӽ��������
		System.out.println("���");
	}
}
/*for ѭ��һ�������ַ���ת��Ϊ���飬whileѭ���Ƚϣ���Ҫ���ͽ����������־λ������Ҫ�����ͱ�־λbiao��һ��
����־λ���������ַ�����������������������������
�м���temp�洢��������ֵ*/



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
	//		System.out.println("����3 "+zu[temp]);
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
		System.out.println("���");
	}
}
*/
