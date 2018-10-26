package Loops;
import java.util.Scanner;
public class activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 0;
int sum=0;
Scanner input = new Scanner(System.in);
System.out.println("Please enter a number. (9999 to quit):");
num= input.nextInt();
while (num != 9999) {
sum=sum+num;
System.out.println("Please enter a number. (9999 to quit):");
num= input.nextInt();
}
System.out.print("Your sum: " + sum);
		}
	}

