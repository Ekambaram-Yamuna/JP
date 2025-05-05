package Java;

public class MethodWithParameter {
	
	public void display()
	{
		System.out.println("I love my mother");
	}
	public void speed(int maxSpeed)
	{
		System.out.println("My max speed is "+maxSpeed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithParameter obj= new MethodWithParameter();
		obj.display();
		obj.speed(250);
		

	}

}
