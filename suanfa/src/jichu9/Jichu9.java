package jichu9;
import java.util.Scanner;
public class Jichu9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sr = Integer.parseInt(sc.nextLine());
		int n = 10000;
		for(;n<1000000;n++)
		{
			int zuo1 = n/100000;
			int temp = n%100000;
			int zuo2 = temp/10000;
			int temp2 = temp%10000;
			int zuo3 = temp2/1000;
			int temp3 = temp2%1000;
			int zuo4 = temp3/100;
			int temp4 = temp3%100;
			int zuo5 = temp4/10;
			int zuo6 = temp4%10;
//			System.out.print(zuo1+"  ");
//			System.out.print(zuo2+"  ");
//			System.out.print(zuo3+"  ");
//			System.out.print(zuo4+"  ");
//			System.out.print(zuo5+"  ");
//			System.out.println(zuo6+"  ");
			if(sr == zuo1+zuo2+zuo3+zuo4+zuo5+zuo6)
			{
				if(zuo1 == 0)
				{
					if(zuo2 == zuo6 && zuo3 == zuo5)
					{
						System.out.println(n);
					}
				}
				else
				{
					if(zuo1 == zuo6 && zuo2 == zuo5 && zuo3 == zuo4)
					{
						System.out.println(n);
					}
				}
			}
			
		}
	}

}
