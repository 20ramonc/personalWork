package Strings;

import java.util.Scanner;

public class contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("sentence?");
		String sentence =input.nextLine();

		input.nextLine();
		
		System.out.println("Bob is in the sentence: " + sentence.contains("Bob"));
		System.out.println("Bob is in the sentence: " + sentence);
		}
		
	}


