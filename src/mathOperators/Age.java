package mathOperators;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
Scanner input = new Scanner (System.in);
System.out.println("Your age?");
age = input.nextInt() +7;

System.out.println("In 7 years your age will be: " + age);
	}

}
