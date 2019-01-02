package designingclasses;
import java.util.Scanner;
import java.util.Random;
public class studenttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Random gen = new Random();
studentclass bob = new studentclass();
int [] tests = new int[5];
for(int j=0; j<tests.length; j++){
	tests[j]=1+gen.nextInt(55);
}
	System.out.println("integer");
	int num = input.nextInt();
	bob.
	System.out.println("lowest score "+ bob.lowestscore());
	System.out.println("avg score"+ bob.averageScore());
	
	input.next();
	
	studentclass tom = new studentclass();
	int [] xtests = new int[5];
	for(int j=0; j<xtests.length; j++){
		xtests[j]=1+gen.nextInt(55);
	}
		System.out.println("integer");
		String xname = input.nextLine();
		tom.addaScore(xname);
		System.out.println("lowest score "+tom.lowestscore());
		System.out.println("avg score" + tom.averageScore());
		System.out.println(bob.equals(tom));
		System.out.println(tom.toString());
		System.out.println(tom.clone());
}
	}


