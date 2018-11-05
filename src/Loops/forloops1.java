package Loops;
import java.util.Scanner;
public class forloops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int counter=0;
System.out.println("How many times do yoy want to display hello?");
Scanner input = new Scanner (System.in);
int hello = input.nextInt();
for(counter=15; counter<=hello; counter=counter+5) {
	System.out.println(counter+" hello");
	}
System.out.println("fav number:");
int fav = input.nextInt();
for(counter=1; counter<=1; counter=counter++) {
	System.out.println(fav+" hello");

}
}
}
