package Loops;
import java.util.Scanner;
public class whilelooplargest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int largest=0;
int counter=0;
Scanner input = new Scanner(System.in);
int count=1;
while(count==1){
	System.out.println("number: ");
	largest=input.nextInt();
	counter++;
	System.out.println("Continue(1=Yes/0=No)");
	count=input.nextInt();
}
System.out.println(largest);
	}

}
