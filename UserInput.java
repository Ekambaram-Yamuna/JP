package Java;
import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //System. in is a standard input stream.
		System.out.println("Enter first number-");
	    int a=sc.nextInt();
	    System.out.println("Enter second number-");
	    int b=sc.nextInt();
	    System.out.println("Enter third number -");
	    int c=sc.nextInt();
	    int d=a+b+c;
	    System.out.println("total sum="+d);
	}

}
