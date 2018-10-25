package Loops;

import java.util.Scanner;

public class activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		num = input.nextInt();
		do {
			System.out.println("enter number(9999 to quit):");
		product = input.nextInt();
		} while (product!= 9999);
		System.out.println("the range of numbers that you entered: ");
			}
	
	} 

