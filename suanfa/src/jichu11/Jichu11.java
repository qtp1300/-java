package jichu11;
import java.math.BigInteger;
import java.util.Scanner;
public class Jichu11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		BigInteger i1 = new BigInteger(s1,16);
		System.out.println(i1.toString(10));
		
	}

}
