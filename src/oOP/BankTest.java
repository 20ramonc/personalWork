package oOP;
import java.util.Scanner;
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank savings = new Bank ();
System.out.println("savings Balance: " + savings.getBalance());
savings.setBalance(150.00);
System.out.println("savings Balance: " + savings.getBalance());
System.out.println("interest rate: " + savings.getrate());
savings.setrate(5.00);
System.out.println("interest rate: " + savings.getrate());
savings.interest();

Bank checking = new Bank ();
System.out.println("checking Balance: " + checking.getBalance());
checking.setBalance(1150.00);
System.out.println("checking Balance: " + checking.getBalance());
System.out.println("interest rate: " + checking.getrate());
checking.setrate(5.00);
System.out.println("interest rate: " + checking.getrate());
checking.withdrawl();
checking.interest();
	}

}
