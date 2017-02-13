package jichu14;
import java.util.Scanner;
public class Jichu14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int i1 = Integer.parseInt(sc.nextLine());
		int i1 = sc.nextInt();
		int s = i1 % 60;
		int m = i1 / 60 % 60;
		int h = i1 / 60 / 60;
		System.out.println(h+":"+m+":"+s);
	}

}
