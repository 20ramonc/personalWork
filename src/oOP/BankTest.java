package oOP;
import java.util.Scanner;
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank savings = new Bank ();
savings.deposit();
savings.interest();
Bank checkings = new Bank ();
checkings.withdrawl();
checkings.charge();

	}

}
