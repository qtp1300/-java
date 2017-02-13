package jichu5;

import java.util.Arrays;
import java.util.Scanner;

public class Jichu5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int [] i2 = new int [n];
		for (int temp = 0;temp<n;temp++)
		{
			i2[temp] = sc.nextInt();
		}
//			System.out.println("complete");
			sc.nextLine();
			int i3 = Integer.parseInt(sc.nextLine());
//			System.out.println("fail?");
			int i4 = 0;
		for (int temp = 0;temp<n;temp++)
		{
			if(i2[temp] == i3 && i4 == 0)
			{
				System.out.print(temp+1+" ");
				i4++;
			}
		}
		if(i4==0)
		{
			System.out.println("-1");
		}
		
		
//		System.out.println(Arrays.toString(i2));
	}

}
