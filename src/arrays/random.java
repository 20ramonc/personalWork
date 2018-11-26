package arrays;
import java.util.Random;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int score[]=new int[250];
Random generator = new Random();
int min=0;
int max=1000;
int largest=0;
for(int counter=0; counter<250; counter++) {
	System.out.println("test score");
	score[counter]= min+generator.nextInt(max-min+1);
	
for(counter=0; counter<250; counter++)
	if(score[counter]>largest)
		largest=score[counter];
}
System.out.println(largest);
}
}
