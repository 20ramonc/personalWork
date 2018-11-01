package Loops;
import java.util.Scanner;
public class largeorsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int largest=0;
int smallest=9999925;

Scanner input = new Scanner(System.in);
System.out.println("enter test score: ");
int test=input.nextInt();
while(test!=9999){
	if(test>=largest) {
		largest=test;
	}
	if(test<smallest) {
	smallest=test;
	}
	System.out.println("Please enter test(9999 to quit)");
	test = input.nextInt();
}
	System.out.println("largest" +largest);
	System.out.println("smallest" + smallest);
	}
	}

