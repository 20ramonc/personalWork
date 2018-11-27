package arrays;
import java.util.Scanner;
import java.util.Random;
public class rolladie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Random generator = new Random();
int max=6;
int min=1;
int [] roll = new int [10000];
int num=0;
for(int j=0; j<10000; j++){
	roll[j]=min+generator.nextInt(max-min+1);
	System.out.println("number");
	num=input.nextInt();
}while(num!=9999);
System.out.println(roll[num]);
System.out.println("number");
num=input.nextInt();
	}

}
