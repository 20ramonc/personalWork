package mathOperators;
import java.util.Scanner;
public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int wall = 8;
Scanner input = new Scanner(System.in);
System.out.println("What is the area of the wall?");
wall = input.nextInt() * 8;
System.out.println("The area of the wall is " + wall + " feet.");

	}

}
