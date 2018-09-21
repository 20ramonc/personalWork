package mathOperators;
import java.util.Scanner;

public class AgesofFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 15;
int age2 = 17;
int age3 = 16;
Scanner input = new Scanner(System.in);
System.out.println("What are the ages of your three friends?");
age = input.nextInt();
age2 = input.nextInt();
age3 = input.nextInt();
System.out.println("The sum of ages of my friends is " +age + age2 + age3);

	}

}
