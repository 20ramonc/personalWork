package Decisions;
import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Age: ");
int age = input.nextInt();
System.out.println("GPA:");
double gPa=input.nextDouble();
if(age+gPa>20) {
	System.out.println("You get $250");			
}
else {
	System.out.println("You get $30");
}
	}

}
