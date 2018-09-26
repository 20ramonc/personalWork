package mathOperators;
import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double change = -99.99;
Scanner input = new Scanner(System.in);
System.out.println("What is the amount of change?");
change = input.nextDouble();
System.out.println((int) (change/1) + " dollars");
change = change % 1.0;
System.out.println((int) (change/.25) + " quarters ");
change = change % .25;
System.out.println((int) (change/.10) + " dimes");
change = change % .10;
System.out.println((int) (change/.05) + " nickels");
change = change % .05;
System.out.println((int) (change/.01) + " pennies");
change = change % .01;
input.close();

	}

}
