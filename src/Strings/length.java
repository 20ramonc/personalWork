package Strings;
import java.util.Scanner;
public class length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("sentence");
int counter=0;
String sentence = input.nextLine();
for (counter=0; counter<sentence.length(); counter++) {
	System.out.println(sentence.charAt(counter));
}
System.out.println(" number of characters " + sentence.length());
	}

}
