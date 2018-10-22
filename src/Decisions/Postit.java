package Decisions;

import java.util.Scanner;

public class Postit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Dimensions of rectangle?");
		int length = input.nextInt();
		int width = input.nextInt();
		System.out.println("1 (inches) 2 (feet)?");
		int question = input.nextInt();
		if (question == 1) {
			System.out.println("number of post-its:" + (int) Math.ceil(length * width) / 9);
		} else {
			System.out.println("number of post-its: " + (int) Math.ceil ((length * width*12) / 9));
		}
	}

}
