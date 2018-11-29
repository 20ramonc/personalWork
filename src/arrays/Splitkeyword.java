package arrays;
import java.util.Scanner;
public class Splitkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("sentence");
String sentence = input.nextLine();
System.out.println("keyword");
String keyword = input.nextLine();
String[] word= sentence.split("");
int times =0;
for( int j=0; j<word.length; j++){
	if(word[j].contains(keyword));
	times++;
}
	System.out.println(times);
	}
}
