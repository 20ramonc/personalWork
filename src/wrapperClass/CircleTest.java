package wrapperClass;
import java.util.ArrayList;
import java.util.Scanner;
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
ArrayList<Circle>radii= new ArrayList<Circle>();
for(int j =0; j<10; j++){
	System.out.println("radius");
	Circle bob=new Circle(input.nextDouble());
	radii.add(bob);
}
for(Circle j:radii){
	System.out.println(j.area());
}
	}

}
