package Loops;
import java.util.Scanner;
public class activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 0;
Scanner input = new Scanner(System.in);
System.out.println("Please enter a number. (9999 to quit):");
num = input.nextInt();
while (num !=9999) {
System.out.println("number * 2: " + num*2);	
System.out.println("Please enter a number. (9999 to quit):");
num=input.nextInt();
}


	}

}
