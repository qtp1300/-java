package jichu16;
import java.util.Scanner;
public class Jichu16 {
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int zhi = 2;
		for(int temp = i1;temp<i2;temp++)
		{
			int temp1 = temp;
			System.out.print(temp+"=");
			if(temp <=zhi)
			{
				System.out.println(temp);
			}
			else 
			{
				while(temp1 % zhi == 0)		//temp������������Ϊ�㣬�������������
				{
					System.out.print(zhi+"*");		//���һ����������Ϊ��һ����Ҫ�������
					temp1 = temp / zhi;
					if(temp1 == 0)
					{
						break;
					}
				}
			}
			System.out.println();
		}
	}
}






//package jichu16;
//import java.util.*;  
//  
///*��һ���������ֽ������� 
// * ÿ������������д�ɼ���������˵���ʽ���⼸�������Ͷ�������������������� 
// */  
//public class Jichu16 {  
//  
//    public static void main(String[] args) {  
//        primeFactor();// ����primeFactor()����  
//    }  
//  
//    /* 
//     * �����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ� 
//     * (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ� 
//     * (2)���n>=k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ����    
//     * (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����   
//     */  
//    public static void primeFactor() {// �÷�����һ���������ֽ����������˵���ʽ  
//  
//        Scanner scan = new Scanner(System.in);// ���տ���̨�������Ϣ  
//        System.out.print("������һ����������");  
//  
//        try {  
//            int num = scan.nextInt();// ȡ������̨�������Ϣ  
//  
//            if (num < 2) {// ���������С��2,�����ʾ��Ϣ  
//  
//                System.out.println("�������벻С��2����������");  
//            } else {  
//  
//                int primeNumber = 2;// ������С������  
//                System.out.print(num + " = ");  
//                  
//                while (primeNumber <= num) {// ������С���������ʱ������ѭ��  
//  
//                    if (primeNumber == num) {// �����������������ʱ,ֱ�����  
//  
//                        System.out.print(num);  
//                        break;// ����ѭ��  
//  
//                    } else if (num % primeNumber == 0) {// ���������������������Ϊ0ʱ,����������  
//  
//                        System.out.print(primeNumber + " * ");  
//                        num = num / primeNumber;// ��ʣ�µĽ������num  
//                          
//                    } else {// ��������Ϊ0ʱ,��������  
//                        primeNumber++;  
//                    }  
//                }  
//            }  
//        } catch (Exception e) {  
//            System.out.println("����������������");// ��׽�쳣,���������������  
//        }  
//    }  
//}  