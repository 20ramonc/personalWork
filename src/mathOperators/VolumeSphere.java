package mathOperators;
import java.util.Scanner;

public class VolumeSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

final double fraction = 1.3333333333;
double radius = -999.9;
double volumeSphere = -999.9;
Scanner input = new Scanner(System.in);
System.out.println("What is the radius?");
radius = input.nextDouble();
volumeSphere = Math.PI * fraction * radius * radius * radius;
System.out.println("the volume of the sphere is " + volumeSphere);


	}

}
