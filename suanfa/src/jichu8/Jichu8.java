package jichu8;

public class Jichu8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		for(;n<10000;n++)
		{
			int zuo1 = n/1000;
			int temp = n%1000;
			int zuo2 = temp/100;
			int temp2 = temp%100;
			int zuo3 = temp2/10;
			int zuo4 = temp2%10;
//			System.out.print(zuo1+"  ");
//			System.out.print(zuo2+"  ");
//			System.out.print(zuo3+"  ");
//			System.out.println(zuo4+"  ");
			if(zuo1 == zuo4 && zuo2 == zuo3)
			{
				System.out.println(n);
			}		
		}
		
	}

}
