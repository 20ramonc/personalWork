package Loops;
import java.util.Scanner;
public class howmany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int how=0;
int sum=0;
int counter=0;
System.out.println("number" );
Scanner input = new Scanner(System.in);
how = input.nextInt();
do {
	counter++;
	sum=sum+how;
	System.out.println("enter number");
	how =input.nextInt();
	
}while(sum<2018);
System.out.println(counter);


}

}
