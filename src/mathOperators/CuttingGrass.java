package mathOperators;
import java.util.Scanner;
public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int length = -99;
int width = -99;
int radius = -99;
int fountain = -99;
int lawn = -99;
double money = -99.9;
double cost = -99.9;
Scanner input = new Scanner(System.in);
System.out.println("What are the dimensions of the lawn?");
length = input.nextInt();  
width = input.nextInt();
System.out.println("What is the radius of the fountain?");
radius = input.nextInt();
lawn = length * width;
fountain = (int) (Math.PI * Math.pow(radius,2));
money = (lawn - fountain)/100;
cost = money*1.25;
System.out.println("The cost is $" + cost);
	}

}
