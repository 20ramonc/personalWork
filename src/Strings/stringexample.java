package Strings;

import java.util.Scanner;

public class stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("name");
		String name= input.nextLine();
		System.out.println("name");
		String name2 = input.nextLine();
		if(name.compareTo(name2)<0) {
			String lowersentence = name.toUpperCase();
			String lowersentence2=name2.toUpperCase();
			System.out.println(lowersentence + " comes before " + lowersentence2);
		}else {
			String lowersentence = name.toUpperCase();
			String lowersentence2=name2.toUpperCase();
				System.out.println(lowersentence2+ " comes before " + lowersentence);
		}
		}

	}


