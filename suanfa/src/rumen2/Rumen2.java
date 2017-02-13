package rumen2;
vgc //可以精简
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
class Rumen2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);			//输入
		String s = sc.nextLine();
		int i = Integer.parseInt(s);
		double PI=3.14159265358979323;					//定义π值
		double mian = i*i*PI;
		BigDecimal xi = new BigDecimal(mian);			//定义一个大小数点数
		double shu = xi.setScale(7,BigDecimal.ROUND_HALF_UP).doubleValue();		//确定7位小数并四舍五入
		DecimalFormat df = new DecimalFormat(".0000000");		//定义一个数字格式，貌似和上一行有冲突的地方
//		df.format(2.3);
		System.out.println(df.format(shu));				//按定义好的字符格式进行格式转换并输出
		
	}

}
