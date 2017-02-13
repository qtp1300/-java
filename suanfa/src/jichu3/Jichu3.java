package jichu3;
import java.util.Scanner;
public class Jichu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				//行
		int m = sc.nextInt();				//列
		String [] s1 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//		System.out.print(s1[1]);
		int i1 = 0;
		
	}
	void dayu()
	{
		for(int te1 = 0;te1<n;te1++)
		{
			
				for(int i2 = i1;i2>0;i2--)
				{

//						System.out.println("1");
						System.out.print(s1[i2]);

				}
				for(int te2 = 0;te2<m-i1;te2++)  
				{
					System.out.print(s1[te2]);	
				}
				
			System.out.println();
			i1++;
			if(i1>25)
			{
				i1=0;
			}
		}
	}


}





/*
package jichu3;
import java.util.Scanner;
public class Jichu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				//行
		int m = sc.nextInt();				//列
		String [] s1 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//		System.out.print(s1[1]);
		int i1 = 0;
		for(int te1 = 0;te1<n;te1++)
		{
			
				for(int i2 = i1;i2>0;i2--)
				{

//						System.out.println("1");
						System.out.print(s1[i2]);

				}
				for(int te2 = 0;te2<m-i1;te2++)  
				{
					System.out.print(s1[te2]);	
				}
				
			System.out.println();
			i1++;
			if(i1>25)
			{
				i1=0;
			}
		}
	}

}
*/