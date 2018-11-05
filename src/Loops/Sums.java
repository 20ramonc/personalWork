package Loops;
import java.util.Scanner;
public class Sums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int num=0;
Scanner input = new Scanner (System.in);
System.out.println("enter two numbers");
num = input.nextInt();
int num1=input.nextInt();
do {
	sum=num+num1;
	System.out.println("sum " + sum);
	System.out.println("enter two numbers");
	num=input.nextInt();
}while(num!=999);
	


}

	}


