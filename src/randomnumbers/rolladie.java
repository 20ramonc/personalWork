package randomnumbers;
import java.util.Scanner;
import java.util.Random;
public class rolladie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();
int min=0;
int max=0;
int roll=0;
int randomNum=0;
System.out.println("Number of sides" );
Scanner input = new Scanner(System.in);
int sides = input.nextInt();
System.out.println("Number of rolls");
int rolls = input.nextInt();
while(randomNum<sides) {
	randomNum=min+generator.nextInt(max-min+1);
}
	System.out.println(" you rolled a " + randomNum);
}
	}


