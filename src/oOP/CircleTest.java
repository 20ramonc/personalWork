package oOP;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle bob = new Circle ();
System.out.println("Circle radius: " + bob.getRadius());
bob.setRadius(5);
System.out.println("Circle radius: " + bob.getRadius());
System.out.println("Circle area: " + bob.area());
System.out.println("Circle circumference: " + bob.circumference());


	}

}
