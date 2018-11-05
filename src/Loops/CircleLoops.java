package Loops;
import java.util.Scanner;
public class CircleLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle bob = new Circle();
int largest=0;
int smallest=99999;
Scanner input = new Scanner(System.in);
System.out.println("radius ");
int radius = input.nextInt();
int radius2 = input.nextInt();
int radius3 = input.nextInt();

do{
	if(radius>radius2 && radius>radius3);
		largest=radius;
	if(radius2>radius3 && radius2>radius);
		largest=radius2;
	if(radius3>radius2 && radius3>radius);
		largest=radius3;
bob.getRadius();
bob.setRadius(largest);
		System.out.println("Radius with largest perimeter is: " + bob.circumference(largest));
		System.out.println("radius");
		radius = input.nextInt();
		radius2=input.nextInt();
		radius3=input.nextInt();
}while(radius!=9999);
	}

}
