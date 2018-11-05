package Loops;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();

		do{
			if(number>largest)
				largest=number;
		System.out.println("Enter a number(9999 to quit):");
		int number1 = input.nextInt();
		
		}while(number!=9999);
		System.out.println(largest);
		}
	}


