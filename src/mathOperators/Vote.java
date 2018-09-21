package mathOperators;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int vote = -999;
Scanner input = new Scanner(System.in);
System.out.println("How many years till you are able to vote?");
vote = input.nextInt() + 1;
System.out.println("In " +vote+ "year I can vote");

	}

}
