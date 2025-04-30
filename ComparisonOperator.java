package Java;

public class ComparisonOperator {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		// Equal to(==)operator
		boolean isEqual=(num1==num2);
		System.out.println("num1 is equal to num2:"+isEqual);
		//Not equal to (!=) operator
		boolean isNotEqual =(num1 != num2);
		System.out.println("num1 is not equal to num2:"+isNotEqual);
		//Greater than (>)operator
		boolean isGreaterThan =(num1 >num2);
		System.out.println("num1 is greater than num2:"+isGreaterThan);
		//Less than (<) operator
		boolean isLessThan=(num1<num2);
		System.out.println("num1 is less than num2:"+isLessThan);
		//Greater than or equal to(>=) operator
		boolean isGreaterThanOrEqual =(num1 >=num2);
		System.out.println("num1 is greater than or equal to num2:"+isGreaterThanOrEqual);
		//Less than or equal to (<=) operator
		boolean isLessThanOrEqual=(num1<=num2);
		System.out.println("num1 is Less than or equal to num2:"+isLessThanOrEqual);
	}

}
