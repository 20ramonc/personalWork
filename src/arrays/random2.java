package arrays;
import java.util.Scanner;
import java.util.Random;
public class random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Random gen = new Random();
int [] rolls = new int [5];
for(int j = 0; j<rolls.length; j++){
	rolls[j]=1+gen.nextInt(6-1+1);
	
}
System.out.println("numbers in the array");
for(int j = 0; j<rolls.length; j++){
	System.out.println(rolls[j]);
}
	}

}
