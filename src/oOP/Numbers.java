package oOP;

public class Numbers {
public Numbers(){
}
public void sayNumber(double num1) {	
	System.out.println("Your number is: " + num1); }

public void sayNumbersPlus2(double num1) {
	System.out.println("Your number plus two is: " + (num1+2));
	
	}
public void saySum (double num1, double num2) {
	System.out.println("answer = " + (num1) + (num1+2));
}
public double returnSquare(double num1) 
{
	double answer = num1*num1;
	return answer;	
}
public double returnArea(double length,double width) {
	return length*width;
}
public int returnRoundUp(double number){
	int temp =(int)Math.ceil(number);
	return temp;
}
}