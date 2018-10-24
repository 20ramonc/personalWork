package Decisions;

import java.util.Scanner;

public class GradePercent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What are your 3 test scores?");
		int test = input.nextInt();
		int test2 = input.nextInt();
		int test3 = input.nextInt();
		char yes = 'y';
		System.out.println("Did you do extra credit?");
		yes = input.next().charAt(0);

		if (yes == 'y') {
			System.out.println("Number of points: ");
			int points = input.nextInt();
			System.out.println("average: " + (((test + test2 + test3) / 3) + points));
		} else {
			System.out.println("average: " + (test + test2 + test3) / 3);
		}
	}

}
