package Decisions;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("How much do you make in a year?");
int salary = input.nextInt();
if(salary<=20000){
System.out.println("You are a worker");

}
else
{
	if(salary<=4000){
	System.out.println("Management");
}
	{
		if(salary<=100000){
			System.out.println("CEO");
		}

		else
			System.out.println("Owner");
}
}
}
}