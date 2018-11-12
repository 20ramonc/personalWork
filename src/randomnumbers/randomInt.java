package randomnumbers;
import java.util.Random;
public class randomInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();
int low =0;
int high=100;
int randomNum=0;
int height=0;
int counter=0;
for(counter=1; counter<=248; counter++) {
	randomNum=low+generator.nextInt(high-low + 1);
	if(randomNum>36);
	height++;
}System.out.println("number of 1st graders that are more than 3ft in height: "  + height);

	}

}
