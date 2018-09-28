package mathOperators;
import java.util.Scanner;
public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int height = 8;
int length = -999;
int width = -999;
int wallarea = -999;
int gallons =-999;
Scanner input = new Scanner(System.in);
System.out.println("What is the length of the room?");
length = input.nextInt();
System.out.println("What is the width of the room?");
width = input.nextInt();
wallarea = 2*(length*height)+ 2*(width*height);
gallons = wallarea/150;
System.out.println("the dimensions of the room is " + height + " feet by " + width + " feet wide by " + length + " feet long");
System.out.println("the area of wall space to be covered is " + wallarea + " square feet");
System.out.println(gallons + " gallons of paint needed to paint the room");
input.close();
	}

}
