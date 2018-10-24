package Decisions;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("test average:");
		int test = input.nextInt();
		System.out.println("homework average:");
		int homework = input.nextInt();
		System.out.println("Is your teacher nice?");
		int nice = input.nextInt();// Is your teacher nice;
		if (nice == 1) {
			if (test > homework) {
				System.out.println(" your grade is: " + test);
			} else {
				System.out.println("your grade is  " + homework);
			}
		} else {
			if (test < homework) {
				System.out.println("Your grade is: " + test);

			} else {
				System.out.println("your grade is  " + homework);
			}

		}

	}
}