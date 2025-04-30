package Java;

//is-a relationship
// is-a relationship between two classes 
//car is a vehicle
  
class Animalnew{
	String name;
	public void eat()
	{
		
		System.out.println("I can eat");
	}
}
class dog extends Animalnew
{
	public void display()
	{
		System.out.println("My name is:"+name);
	}
}
class Animal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog obj=new dog();
		obj.name="puppy";
		obj.display();
		obj.eat();

	}

}
