package Java;

public class AllOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// && operator
		System.out.println((6>3)&&(8>6)); //true
		System.out.println((6>3) && (8 < 6));//false
		
		// ||operator
		System.out.println((6 < 3 )|| (8>6)); //true
		System.out.println((6>3) || (8<6)); //true
		System.out.println((6<3)||(8<6)); //false
		
		//! operator
		System.out.println(!(6==3)); //true
		System.out.println(!(6>3)); //false
		
		

	}

}
