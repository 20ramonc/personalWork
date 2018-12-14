package arraysList;
import java.util.ArrayList;
import java.util.Random;
public class rectangl2test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random gen = new Random();		
ArrayList<rectangle2>rectangles=new ArrayList<rectangle2>();
double smallest=0;
double largest=0;
for(int j=0; j<=20; j++){
rectangle2 bob = new rectangle2(1+gen.nextInt(50),(1+gen.nextInt(50)));
rectangles.add(bob);	
}
for(int j=0; j<=20; j++){
	rectangle2 box = rectangles.get(j);
	System.out.println(j+ ". area"+ box.returnArea());
}

}

	}


