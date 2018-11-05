package Loops;
import java.util.Scanner;
public class averageandsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double avg = 0;
int sum = 0;
int count=0;
int num=0;
Scanner input = new Scanner(System.in);
System.out.println("test score: ");
num = input.nextInt();
while(num!=9999){
	count++;
	sum= sum+num;
	
	System.out.println("test score" );
	num=input.nextInt();
}
	avg= sum/count;
System.out.println("avg "+avg );
System.out.println("sum "+sum );
	}

}
