package Loops;
import java.util.Scanner;
public class activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 0;
int multiply=0;
while (num !=9999) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a number. (9999 to quit):");
	int num1 = input.nextInt();
	multiply=num1*2;
	System.out.println("Your number times two is: " + multiply);
}

	}

}
