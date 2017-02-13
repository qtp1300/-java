package aaaaaa;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Aaaaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
import java.math.BigDecimal;
import java.text.DecimalFormat;
BigDecimal xi = new BigDecimal(mian);			//定义一个大小数点数
double shu = xi.setScale(7,BigDecimal.ROUND_HALF_UP).doubleValue();		//确定7位小数并四舍五入
DecimalFormat df = new DecimalFormat(".0000000");		//定义一个数字格式，貌似和上一行有冲突的地方
//df.format(2.3);
System.out.println(df.format(shu));				//按定义好的字符格式进行格式转换并输出
*/

/*
 * 各种进制之间的互换
int i2 = Integer.parseInt(s1,10);						输入String s1 s1进制为 “10”
String s2 = Integer.toBinaryString(i2);					to二进制	~~~~~			
System.out.println(s2);									输出
*/

/*
System.out.println(Arrays.toString(zu));  //直接将数组输出
*/





/*
package jichu11;
import java.math.BigInteger;
import java.util.Scanner;
public class Jichu11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		BigInteger i1 = new BigInteger(s1,16);
		System.out.println(i1.toString(10));
		
		//还有一种通用的方法  
		BigInteger bigInt = new BigInteger(str, int1);  
		System.err.println(bigInt.toString(int2));  
		//其中str为需要转换的字符串，int1为str的所属进制，int2为所需转为的进制  
		
	}

}
*/

