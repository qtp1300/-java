package jichu6;
import java.util.Scanner;
public class Jichu6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i1 = Integer.parseInt(sc.nextLine());
		int [][] zu = new int [i1][i1];
//		zu [0][0] = 1;
//		zu [1][0] = 1;zu [1][1] = 1;
//		zu [2][0] = 1;zu [2][1] = 2;zu [2][2] = 1;
		for (int hang = 0;hang<i1;hang++)
		{
//			System.out.print("µÚ"+hang+"ÐÐ");
			for (int ge = 0;ge<=hang;ge++)
			{
				zu[hang][0] = 1;zu[hang][hang] = 1;
				if(hang>=2 && ge != 0 && ge != hang)
				{
					zu[hang][ge] = zu[hang-1][ge] + zu[hang-1][ge-1];
				}
				System.out.print(zu[hang][ge]+" ");
//				zu [hang][]
//				System.out.print();\
			}
			System.out.println();
		}
	}

}
