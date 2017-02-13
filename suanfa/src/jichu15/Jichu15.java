package jichu15;
import java.util.Scanner;
public class Jichu15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int i1 = s1.length();
		int i2 = s2.length();
//		System.out.println(i1);
//		System.out.println(i2);
		if(i1 != i2 )
		{
			System.out.println("1");
			
		}
		else
		{
			if(s1.equals(s2))
			{
				System.out.println("2");
			}
			else if(s1.equalsIgnoreCase(s2))
				{
					System.out.println("3");
				}
			else
			{
				System.out.println("4");
			}
			
		}
	}

}
