package Strings;
import java.util.Scanner;
public class compareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("name");
String word1= input.nextLine();
System.out.println("name");
String word2 = input.nextLine();
if(word1.compareTo(word2)<0) {
	System.out.println(word1 + " comes before " + word2);
}else {
	if(word1.compareTo(word2)>0){
		System.out.println(word2+ " comes before " + word1);
}else {
	System.out.println("The names are the same");
}
}


	}

}
