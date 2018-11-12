package randomnumbers;
import java.util.Scanner;
import java.util.Random;
public class rolladie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();

int randomNum=0;
System.out.println("Number of sides" );
Scanner input = new Scanner(System.in);
int max = input.nextInt();
int min=1;
System.out.println("Number of rolls");
int rolls = input.nextInt();
for(int roll=1; roll<=rolls; roll++) {
	randomNum=min+generator.nextInt(max-min+1);

	System.out.println("you rolled a " +randomNum);
}
	}
}

