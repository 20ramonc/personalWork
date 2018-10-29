package Loops;
import java.util.Scanner;
public class nestedloops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int counter=0;
for(int j=1; j<=4; j++) {
	System.out.print((j*2)+ " ");
for(counter=1; counter<=5; counter++) {
	if(counter!=3) {
		System.out.print(counter+ " ");
	}else {
		System.out.print(j + " ");
	}
}
System.out.println();
	}

}
	}

