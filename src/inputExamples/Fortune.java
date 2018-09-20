package inputExamples;
import java.util.Scanner;
public class Fortune {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double weight = 180.0;
int age = 17;
int luckynumber = 43;
Scanner input = new Scanner(System.in);
System.out.println("Enter your weight:"); 
weight = input.nextDouble();
System.out.println(" \nEnter your age:");
age= input.nextInt();
System.out.println(" \nEnter your lucky number:");
luckynumber = input.nextInt();
System.out.println("In the future I see something strange \n 42 years from now you will live on the street. You will be reside number 17180 at the old folks home.");
	}

}
