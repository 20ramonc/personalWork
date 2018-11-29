package arrays;
import java.util.Scanner;
public class Splitex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("sentence");
String sentence=input.nextLine();

String [] words = sentence.split("");

System.out.println("sentence breakdown");
for( int j=0; j<sentence.length(); j++){
	System.out.println(words[j].charAt(0));
}
	}

}
