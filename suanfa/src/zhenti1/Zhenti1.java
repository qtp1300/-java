package zhenti1;
import java.util.Scanner;
public class Zhenti1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String s1 = sc.nextLine();
//		
////		System.err.println(s1);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		int hetao = 1;
		while(hetao%i1 != 0 || hetao%i2 != 0 || hetao%i3 != 0 || hetao < i1 || hetao < i2 || hetao < i3)
		{
			hetao++;
		}
//		System.out.println(i1);
//		System.out.println(i2);
//		System.out.println(i3);
		System.out.println(hetao);
		
	}

}
