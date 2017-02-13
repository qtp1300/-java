package jichu4;
import java.util.Scanner;
import java.util.Arrays;
public class Jichu4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i1 = Integer.parseInt(sc.nextLine()) ;				//n¸öÊý
		int [] i2 = new int [i1];
		int i3 = 0;
		for (int temp = 0;temp<i1;temp++)
		{
			i2[temp] = sc.nextInt();
		}
		
//		System.out.println(Arrays.toString(i2));
		Arrays.sort(i2);
//		System.out.println(i1);
		System.out.println(i2[i1-1]);
		System.out.println(i2[0]);
		for (int temp = 0;temp<i1;temp++)
		{
			i3 = i3+i2[temp];
		}
		System.out.println(i3);
//		System.out.println(Arrays.toString(i2));
	}
//	class digui
//	{
//		
//	}

}
