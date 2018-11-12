package Strings;
import java.util.Scanner;
public class charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("sentence?");
String sentence =input.nextLine();

input.nextLine();

System.out.println("first letter is " + sentence.charAt(0));
System.out.println("third letter is " + sentence.charAt(2));
System.out.println(sentence);




	}

}
