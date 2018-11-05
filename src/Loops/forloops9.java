package Loops;
import java.util.Scanner;
public class forloops9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int counter =0;
int total=0;
int num=0;
Scanner input = new Scanner(System.in);
for(counter=1; counter<=5; counter=counter++) {
	System.out.println("number: ");
	num=input.nextInt();
	total+=num;
	System.out.println(total);
} 
	}
}


