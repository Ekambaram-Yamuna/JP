package Java;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20, y=10;
		if(x<30)
		{
			System.out.println("x < 30");
			  if(y>8)
			   {
				  System.out.println("y>8");
			   }
		}
		else 
		{
			System.out.println("x is not  < 30 & y >8");
		}

	}

}
