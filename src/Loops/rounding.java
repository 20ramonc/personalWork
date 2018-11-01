package Loops;
import java.util.Scanner;
public class rounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int round=0;
int tens=0;
System.out.println("enter a four digit number");
Scanner input = new Scanner(System.in);
round=input.nextInt();
while(round!=9999) {
	tens= (round%100);
	if(tens>50){
		round=(round/100)+1;
		round=round*100;
	}else {
		round=(round/100);
		round=round*100;
	}
	System.out.println("rounded to the hundreds place : " + round);

System.out.println("enter a four digit number");
round = input.nextInt();
}
	}

}
