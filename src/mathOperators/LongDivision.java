package mathOperators;
import java.util.Scanner;

public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dividend= 99;
int divisor = -99;
int remainder = -99;
int whole = -99;
Scanner input = new Scanner(System.in);
System.out.println("What is the dividend?");
dividend = input.nextInt();
System.out.println("What is the divisor?");
divisor = input.nextInt();
remainder = dividend%divisor;
whole = dividend/divisor;
System.out.println("number: " + whole + " remainder: " + remainder);
	}

}
