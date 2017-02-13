package jichu1;
import java.util.Scanner;
public class Jichu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i1 = Integer.parseInt(sc.nextLine());
		int i2 = i1%100;
		int i3 = i1%4;
		int i5 = i1%400;
		if((i2 != 0 && i3 == 0 ) || ( i5 == 0 ))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
