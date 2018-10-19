package Decisions;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What are three integers?");
int number1=input.nextInt();
int number2=input.nextInt();
int number3=input.nextInt();
int largest=-99;
System.out.println("What is the largest of three integers");
if(number1<number2&&number2<number3);
largest=number3; 

if(number1>number2&&number1>number3);
largest=number1;

if(number3>number1&&number3<number2);
largest=number2;

	System.out.println("largest integer:" + largest);
}
}
