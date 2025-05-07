package Java;

 class Animal1 {
	 void eat()
	 {
		 System.out.println("I  can eat ");
	 }
 }
 class dog1 extends Animal1
 {
	
	 public void eat()
	 {
		  super.eat();
		 System.out.println("I eat dog food");
	 }
	 public void bark()
	 {
		 System.out.println("I can dark");
	 }
 }
	 
  class SuperExample{
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	dog1 obj =new dog1();
	obj.eat();
	obj.bark();
       
	

}
  }
	 
	 
