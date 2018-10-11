package oOP;
import java.util.Scanner;
public class Bank {
private double Balance;
private int Accountnumber;
private double rate;
public Bank () {
	Balance = 0.00;
	Accountnumber = 000-000;
	rate= 0.00;
}
public double getBalance () {
	return Balance;
}
public int getAccountnumber () {
	return Accountnumber;
}
public double getrate () {
	return rate;
}
public void setBalance (double newBalance) {
	Balance = newBalance;
}
public void setAccountnumber (int newAccountnumber) {
	Accountnumber = newAccountnumber;
}
public void setrate (double newrate) {
	rate = newrate;
}
public double deposit () {
Scanner input = new Scanner(System.in);
System.out.println("Account number: ");
double Accountnumber = input.nextDouble();
System.out.println("deposit: ");
double deposit = input.nextDouble();
System.out.println( "new balance: " + (Balance+deposit));
return Balance;
}
public double withdrawl () {
	Scanner input = new Scanner(System.in);
	System.out.println("withdraw1: ");
	double withdrawl = input.nextDouble();
	System.out.println( "new balance: " + (Balance-withdrawl));
	return Balance;
}
public double interest () {
	Scanner input = new Scanner(System.in);
	System.out.println("interest rate: ");
	double rate = input.nextDouble();
	Balance= Balance*(rate/100) +1;
	System.out.println("new balance: "+ (Balance+rate));
	return Balance;
}
public double charge () {
	Scanner input = new Scanner(System.in);
	System.out.println("finance chage: ");
	double charge = input.nextDouble();
	System.out.println("new balance: "+ (Balance+rate-charge));
	return Balance;
}
}
