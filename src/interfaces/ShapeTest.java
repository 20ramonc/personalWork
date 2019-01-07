package interfaces;
import java.util.Scanner;
public class ShapeTest {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("length");
int length = input.nextInt();
System.out.println("width");
int width = input.nextInt();
Shape thing= new Rectangle(length,width);
System.out.println("Rectangle perimeter:"+ thing.perimeter());
System.out.println("Rectangle area: " + thing.area());
	}

}
