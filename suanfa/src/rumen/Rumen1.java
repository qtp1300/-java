package rumen;
import java.util.Scanner;

class Rumen1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = Integer.parseInt(s);
		int [] w = new int[i+1];				//����>0�����������w[0]��������i+1
		
		int n;
		switch(i)
		{
			case 1:								//����Ϊ����ֵ1���1
				System.out.println("1");
				break;
			case 2:								//����Ϊ����ֵ2���1
				System.out.println("1");
				break;
//			case 3:
//				System.out.println("2");
//				break;
			default:							//����case�������������ִ��default
				for(n=3;n<=i;n++)				//ѭ������Fn
				{
					w[1] = 1;
					w[2] = 1;
					w[n] = w[n-1]+w[n-2];
					if(w[n]>10007)				//���fnֵ����10007,��������������int���
					{
						w[n]=w[n]%10007;
//						System.out.print(n+"   ");
//						System.out.println(w[n]);
					}
					
				}
//				System.out.println(w[i]);
//				int shuchu;
//				shuchu = w[i]%10007;
//				System.out.println(shuchu);
				System.out.println(w[i]);		
				break;
		}
		
	}

}
