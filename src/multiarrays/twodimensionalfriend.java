package multiarrays;
import java.util.Random;
import java.util.Scanner;
public class twodimensionalfriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Random generator = new Random();
friend [][] friend = new friend[18][5];
for(int row = 0; row<friend.length; row++){
	for(int column=0; column<friend[0].length;column++){
		int a=generator.nextInt(101);
		friend[row][column]= new friend("", a);
	}
}
for(int row=0; row<friend.length; row++){
	for(int column=0; column<friend[0].length; column++){
		System.out.print(friend[row][column].getAge()+ " ");
	}
	System.out.println();
}

	}

}
