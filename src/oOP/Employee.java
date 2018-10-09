package oOP;

public class Employee {
	private double wage;
	private int experience;
public Employee (){
	wage = -999;
	experience = -999;
}
public double getWage() {
	return wage;
}
public int getExperience () {
	return experience;
}
public void setWage(double newWage) {
	wage = newWage;
}
public void setExperience(int numExperience) {
	experience = numExperience;
}
}