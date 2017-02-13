package jichu7;
import java.text.DecimalFormat;
public class Jichu7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] shu = new int [9999];
		int ji = 0;
		int temp = 0;
		for(;temp<1000;temp++)
		{
			DecimalFormat df = new DecimalFormat("000");
			int temp1 = 0;
			int temp2 = 0;
			int aaa   = temp / 100  ;
			temp1 = temp % 100 ;
			int bbb   = temp1 / 10;
			int ccc = temp1 % 10;
			if(temp == aaa*aaa*aaa+bbb*bbb*bbb+ccc*ccc*ccc)
			{
				shu [ji] = temp;
				ji++;

			}
//			System.out.println(df.format(temp));
		}
		for(int chu = 0;chu<ji;chu++)
		{
			int cccc = shu[chu];
			System.out.println(cccc);
//			System.out.println(df.format(cccc));
		}
	}

}
