package xiaoneiA;

import java.util.Scanner;

/*
 * 
����ʽ��ϵ�����ɣ��ҹ���ѧ�Һ���ͷ����ˡ�

�硾ͼ1.png�����ҹ�������ѧ�����1261�������ġ��������㷨��һ����ͳ����ˡ�

�����й��ɣ�
1
1    1
1    2    1
1    3    3    1
1    4    6    4    1
1    5    10   10   5    1
1    6    15   20   15   6    1
1    7    21   35   35   21   7    1

���µĳ�����������N�е���������Ρ�����д���߲���ȱ�ٵĴ��롣

ע�⣺ֻ��д���߲��ֵĴ��룬��Ҫ��д�κζ�������ݡ�
 * 
 */
public class XiaoneiA
{
	public static void main(String[] args)
	{
		Scanner sao = new Scanner(System.in);
		String shu = sao.nextLine();
		int N = Integer.parseInt(shu);
		
//		int N = 8;
		int[][] a = new int[N][N] ;
		
		for(int i=0; i<N; i++){
			a[i][0] = 1;
			a[i][i] = 1;
		}
		
		for(int i=1; i<N; i++){
			for(int j=1; j<i; j++)
			{
			a[i][j]=a[i-1][j]+a[i-1][j-1];  //���
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<=i; j++)	System.out.print(String.format("%-5d", a[i][j]));
			System.out.println();
		}	
	}
}