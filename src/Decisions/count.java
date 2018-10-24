package Decisions;
import java.util.Scanner;
public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int count = 0;
int sum = 0;
System.out.println("end number:");
int end = input.nextInt();
while (count<=end){
	System.out.println(count);
sum+=count;
count+=2;
}
System.out.println("sum=" + count);
	}
}
