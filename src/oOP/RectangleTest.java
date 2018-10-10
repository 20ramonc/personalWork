package oOP;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle bob = new Rectangle ();
System.out.println("Rectangle length: " + bob.getLength());
bob.setLength(8);
System.out.println("Rectangle length: " + bob.getLength());
System.out.println("Rectangle width: " + bob.getWidth());
bob.setWidth(4);
System.out.println("Rectangle length: " + bob.getWidth());
System.out.println("Circle radius: " + bob.perimeter());
System.out.println("Circle radius: " + bob.area());

}
}


