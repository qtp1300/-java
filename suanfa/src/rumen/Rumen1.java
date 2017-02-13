package rumen;
import java.util.Scanner;

class Rumen1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = Integer.parseInt(s);
		int [] w = new int[i+1];				//输入>0，所以数组的w[0]跳过，故i+1
		
		int n;
		switch(i)
		{
			case 1:								//输入为特殊值1输出1
				System.out.println("1");
				break;
			case 2:								//输入为特殊值2输出1
				System.out.println("1");
				break;
//			case 3:
//				System.out.println("2");
//				break;
			default:							//所有case都不符合情况下执行default
				for(n=3;n<=i;n++)				//循环计算Fn
				{
					w[1] = 1;
					w[2] = 1;
					w[n] = w[n-1]+w[n-2];
					if(w[n]>10007)				//如果fn值大于10007,则求余数，避免int溢出
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
