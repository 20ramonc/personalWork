package Decisions;
import java.util.Scanner;
public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter test score: ");
double test1 = input.nextDouble();
System.out.print("Enter second test score:");
double test2 = input.nextDouble();
if (test1>test2){
	System.out.println("Great job!!");
System.out.println(test1-test2);
}
System.out.println("have a nice day");
	}

}
