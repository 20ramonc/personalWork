package arraysList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class sequentialsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random gen = new Random();
boolean score = false;
Scanner input = new Scanner(System.in);
ArrayList<Integer>scores=new ArrayList<Integer>();
for(int j =0; j<10; j++){
	scores.add(200+gen.nextInt(1000-200+1));
}
for(int j =0; j<10; j++){
System.out.println("SAT score");
int SAT = input.nextInt();
		if(scores.get(j)==SAT){
			score=true;
		System.out.println("its in the arrayList");
		}else{
			System.out.println("its not in the arrayList");
		}
}
}
}