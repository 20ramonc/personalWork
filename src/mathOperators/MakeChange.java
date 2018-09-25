package mathOperators;
import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double change = -99.99;
 int dollars = -99;
 int quarters = -99;
 int dimes = -99;
 int nickles = -99;
 int pennies = -99;
Scanner input = new Scanner(System.in);
System.out.println("What is the amount of change?");
change = input.nextDouble();
dollars = (int) ((double)change/(double)1.00);
quarters = (int) ((double)change/(double)0.25);
dimes = (int) ((double)change/(double)0.10);
nickles = (int) ((double)change/(double)0.05);
pennies = (int) ((double)change/(double)0.01);
System.out.println("dollars: " + dollars + "\nquarters: " + quarters + "\nnickles" + nickles + "\npennies" + pennies);
input.close();

	}

}
