package Strings;
import java.util.Scanner;
public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("password");
String password = input.nextLine();

System.out.println("vertify");
String verify = input.nextLine();

while(!password.equals(verify)) {
	System.out.println("password");
	password=input.nextLine();
	System.out.println("verify");
	verify = input.nextLine();
}
	}

}
