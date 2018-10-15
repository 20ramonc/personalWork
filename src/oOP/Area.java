package oOP;
import java.util.Scanner;
public class Area {
public Area (){}

public void room(){
	Scanner input = new Scanner(System.in);
	System.out.println("What is the length of the wall?");
	int lengthwall = input.nextInt();
	System.out.println("What is the height of the wall?");
	int heightwall = input.nextInt();
	System.out.println("The area of the wall is: " + (lengthwall*heightwall));
}
public void areawithdoor() {
	Scanner input = new Scanner(System.in);
	System.out.println("What is the length of the wall?");
	int lengthwall = input.nextInt();
	System.out.println("What is the height of the wall?");
	int heightwall = input.nextInt();
	System.out.println("What is the length of the door?");
	int lengthdoor = input.nextInt();
	System.out.println("What is the height of the door?");
	int heightdoor = input.nextInt();

	System.out.println("the area of the wall is:");
	System.out.println((lengthwall*heightwall)-(lengthdoor*heightdoor));
}

	
}


