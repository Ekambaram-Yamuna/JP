package Java;
import java.util.Scanner;

public class IfElse_Sample_Login {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String correctUsername = "admin";
	        String correctPassword = "1234";

	        System.out.print("Enter username: ");
	        String username = sc.nextLine();

	        System.out.print("Enter password: ");
	        String password = sc.nextLine();

	        if (username.equals(correctUsername) && password.equals(correctPassword)) {
	            System.out.println("Login Successful!");
	        } else if (!username.equals(correctUsername)) {
	            System.out.println("Invalid Username");
	        } else if (!password.equals(correctPassword)) {
	            System.out.println("Invalid Password");
	        } else {
	            System.out.println("Login Failed");
	        }

	        sc.close();
	    }
	}



