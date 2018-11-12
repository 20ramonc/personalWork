package randomnumbers;
import java.util.Scanner;
import java.util.Random;
public class rolladie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double roll1=0;
double roll2=0;
double roll3=0;
double roll4=0;
double roll5=0;
double roll6=0;
int low=1;
int high=6;
int randomNum=0;
System.out.println("rolls");
Scanner input = new Scanner(System.in);
int rolls=input.nextInt();
for(int counter=0; counter<rolls; counter++) {
	
	randomNum=low+(int)(Math.random()*(high-low+1));
	if(randomNum==1){
		roll1++;
	}
	if(randomNum==2) {
		roll2++;
	}
	if(randomNum==3) {
		roll3++;
	}
	if(randomNum==4) {
		roll4++;
	}
	if(randomNum==5) {
		roll5++;
	}
	if(randomNum==6) {
		roll6++;
	}
}
	System.out.println("rolled a 1 " + roll1);
	System.out.println("percentage " + (roll1/rolls)*100);
	System.out.println("rolled a 2 " + roll2 );
	System.out.println("percentage " + (roll2/rolls)*100);
	System.out.println("rolled a 3 " + roll3 );
	System.out.println("percentage " + (roll3/rolls)*100);
	System.out.println("rolled a 4 " + roll4 );
	System.out.println("percentage " + (roll4/rolls)*100);
	System.out.println("rolled a 5 " + roll5);
	System.out.println("percentage " + (roll5/rolls)*100);
	System.out.println("rolled a 6 " + roll6);
	System.out.println("percentage " + (roll6/rolls)*100);
input.close();
	} 

	}

