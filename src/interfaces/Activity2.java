package interfaces;

import java.util.ArrayList;

public class Activity2 {

	public static void main(String[] args) {
		Rectangle rect= new Rectangle(2,1);
		Circle cir=new Circle(2);
		Rectangle rect2= new Rectangle(4,3);
		Circle cir2=new Circle(3);
		ArrayList<Shape> Shapes = new ArrayList<Shape>();
		Shapes.add(rect2);
		Shapes.add(rect);
		Shapes.add(cir2);
		Shapes.add(cir);
		double total=0.0;
			for(Shape sum: Shapes){
				total+=sum.area();
			}
		double smallest=1000000000.0;
		for(Shape small: Shapes){
			if(small.perimeter()<smallest){
				smallest = small.perimeter();
			}
		}
		System.out.println("Sum of areas" +total);
		System.out.println("smallest"+smallest);
		 
	}

}
