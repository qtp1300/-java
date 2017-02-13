/*break会直接跳转到while外面，不管当前是否在if中，而不能跳出if
 *只能跳出1层 */
package test001;

public class Test006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(true)
//		{
//			System.out.println("ni");
//			while(true)
//			{
//				System.out.println("aa");
//				break;
//			}
//			System.out.println("aa");
		
		
		
		
		
		while(true)
		{
			System.out.println("aa");
			while(true)
			{
				System.out.println("bb");
				break;
			}
			System.out.println("cc");
		}
		System.out.println("aa");
		
		
		
		
//		while(true)
//		{
//			System.out.println("aa");
//			if(true)
//			{
//				System.out.println("bb");
//				break;
//			}
//			System.out.println("cc");
//		}
//		System.out.println("aa");
		
	}

}
