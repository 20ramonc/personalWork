package Strings;
import java.util.Scanner;
public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
String text = "My name is Buzz Lightyear!";
String text2= text.substring(16, text.length());
System.out.println("Hi " + text2);
for(int i=0; i < text.length(); i++) {
	System.out.println(text.substring(0,i));
}
	}

}
