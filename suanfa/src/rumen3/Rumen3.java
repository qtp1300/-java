package rumen3;
import java.util.Scanner;
public class Rumen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long i = Long.parseLong(s);
		long chu = ((i+1)*i)/2;
		System.out.println(chu);
	}

}
