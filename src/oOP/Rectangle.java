package oOP;

public class Rectangle {
private double length;
private double width;
public Rectangle () {
	length = 0;
	width = 0;
}
public double getLength() {
	return length;
}
public double getWidth () {
	return width;
}
public void setLength(double newlength) {
	length = newlength;
}
public void setWidth(double newwidth) { 
	width = newwidth;
}
public double perimeter () {
	return 2*(length+width);
}
public double area () {
	return length * width;
}
}
