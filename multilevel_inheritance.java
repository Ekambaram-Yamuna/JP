package Java;

class shape{
	 public void display()
	 {
		 System.out.println("Inside Display");
	 }
}
class Rectangle extends shape
{
	public void area()
	{
		System.out.println("Inside Area");
	}
}
class cube extends Rectangle{
	public void volume()
	{
		System.out.println("Inside volume");
	}
}
public class multilevel_inheritance {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		cube obj =new cube();
		obj.display();
		obj.area();
		obj.volume();
		
		
		

	}

}
