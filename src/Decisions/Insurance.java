package Decisions;

import java.util.Scanner;

public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("age: ");
		int old = input.nextInt();
		if (old > 75) {
			System.out.println("pay extra $125");
			old = 125;
		} else {
			System.out.println("$25 discount");
			old = -25;
		}
		System.out.println("1 (smoke) 2 (don't smoke)");
		int smoke = input.nextInt();
		if (smoke == 1) {
			System.out.println("pay extra $50");
			smoke = 50;
		} else {
			System.out.println("$40 discount");
			smoke = -40;
		}
		System.out.println("weight:");
		int weight = input.nextInt();
		if (weight > 700) {
			System.out.println("pay extra $300");
			weight = 300;
		} else {
			System.out.println("don't pay extra");
			weight = 0;
		}
		System.out.println("total cost: " + (200 + weight + smoke + old));
	}

}
