package Strings;
import java.util.Scanner;
public class socialsecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("social security number: ");
String security = input.nextLine();
System.out.println(security.substring(7));
System.out.println(security.substring(4, 6));
System.out.println(security.substring(0, 3));


	}

}
