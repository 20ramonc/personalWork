package arrays;
import java.util.Scanner;
import java.util.Random;
public class Splitrandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Random generator = new Random();
System.out.println("sentence");
String sentence=input.nextLine();

String [] words = sentence.split(" ");

int min=0;
int max=words.length-1;
int randomWord=min+generator.nextInt(max-min+1);
System.out.println("random word is " + words[randomWord]);
	}

}
