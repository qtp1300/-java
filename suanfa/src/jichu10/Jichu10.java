package jichu10;
import java.util.Scanner;
public class Jichu10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i1 = Integer.parseInt(sc.nextLine());
		String s1 = Integer.toHexString(i1);
		String s2 = s1.toUpperCase();
		System.out.println(s2);		
	}

}
