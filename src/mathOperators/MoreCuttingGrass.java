package mathOperators;
import java.util.Scanner;
public class MoreCuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int length = -99;
int width = -99;
int area = -99;
int widthmower = -99;
int widthmower2 = -99;
int speedmower= -99;
final double rate = 12.00;
double cost = -99.9;
Scanner input = new Scanner(System.in);
System.out.println("What is the length and width of the lawn?");
length = input.nextInt();
width = input.nextInt();
System.out.println("What is the width of the mower?");
widthmower = input.nextInt();
System.out.println("What is the speed of the mower?");
speedmower = input.nextInt();
area = (length*width);
widthmower2 = (((widthmower)*12)/5280);
cost = ((int) speed/rate);

	}

}
