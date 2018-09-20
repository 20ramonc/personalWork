package inputExamples;
import java.util.Scanner;
public class AgeandWeight {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age= 17;
		Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
age = input.nextInt();
System.out.println( age + " years old.");
double weight = 128.0;

System.out.println("What is your height?");
weight = input.nextDouble();
System.out.println(weight + "pounds");



	}

}
