package designingclasses;
import java.util.Scanner;
public class Booktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner(System.in);

System.out.println("title");
String title = input.nextLine();
System.out.println("number of pages");
int pages = input.nextInt();
book bob  = new book(title,pages);


input.nextLine();

System.out.println("title");
String xtitle = input.nextLine();
System.out.println("number of pages");
int xpages = input.nextInt();
book tom  = new book(xtitle,xpages);
System.out.println(bob.equals(tom));
System.out.println(bob.toString());
System.out.println(bob.clone());
	}

}
