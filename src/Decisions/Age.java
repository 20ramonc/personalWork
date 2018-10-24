package Decisions;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please ener age: ");
int age=input.nextInt();
System.out.println(age==16);
System.out.println("Ener height and shoe size");
double height = input.nextDouble();
double shoesize= input.nextDouble();
System.out.println(height+shoesize>=26);
	}

}
