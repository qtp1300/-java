package rumen2;
vgc //���Ծ���
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
class Rumen2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);			//����
		String s = sc.nextLine();
		int i = Integer.parseInt(s);
		double PI=3.14159265358979323;					//�����ֵ
		double mian = i*i*PI;
		BigDecimal xi = new BigDecimal(mian);			//����һ����С������
		double shu = xi.setScale(7,BigDecimal.ROUND_HALF_UP).doubleValue();		//ȷ��7λС������������
		DecimalFormat df = new DecimalFormat(".0000000");		//����һ�����ָ�ʽ��ò�ƺ���һ���г�ͻ�ĵط�
//		df.format(2.3);
		System.out.println(df.format(shu));				//������õ��ַ���ʽ���и�ʽת�������
		
	}

}
