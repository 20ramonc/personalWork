package oOP;

public class Circle {
private double radius;
public Circle () {
radius = 0;	

}
public double getRadius() {
	return radius;
}
public void setRadius (double newRadius) {
	radius = newRadius;
}
public double area () {
return Math.PI *radius *radius;
}
public double circumference () {
	return Math.PI*(radius*2);
	
}

}
