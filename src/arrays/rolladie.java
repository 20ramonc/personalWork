package arrays;
import java.util.Scanner;
import java.util.Random;
public class rolladie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int [] roll = new int [10000];
int num=0;
for(int j=0; j<roll.length; j++){
	System.out.println("number");
	num=input.nextInt();
}while(num!=9999);
System.out.println(roll[num]);
System.out.println("number");
num=input.nextInt();
	}

}
