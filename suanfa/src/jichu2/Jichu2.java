package jichu2;

import java.text.DecimalFormat;

public class Jichu2 {
	public static void main(String[] args){
		for(int temp = 0;temp<32;temp++)
			{
				DecimalFormat df = new DecimalFormat("00000");
				String s1 = Integer.toBinaryString(temp);
				int i1 = Integer.parseInt(s1);
				System.out.println(df.format(i1));
			}
	}
}








//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//public class Jichu2{
//	public static void main(String[] args){
//		int [] i1 = new int [32];
//		String [] s1 = new String[32];
//		ArrayList<Integer> Ar = new ArrayList<Integer>();
//		
//		for(int temp = 0;temp<32;temp++)
//		{
////			i1[temp] = temp;
//			i1[temp] = temp;
//			Ar.add(i1[temp]);
////			System.out.println(i1[temp]);
//			i1[temp] = Integer.valueOf(i1[temp], 2);
////			Integer.valueOf(s1[temp], 2);
//			
//		}
////		Ar.add(s1);
//		System.out.println(Ar);
//		Collections.reverse(Ar);
//		System.out.println(Ar);
////		System.out.println(Arrays.toString(i1));
//	}
//}