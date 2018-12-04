package multiarrays;
import java.util.Random;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();
int sum=0;
final int maxrow=3;
final int maxcolumn=7;
int [] [] random = new int [maxrow][maxcolumn];

for(int column=0; column<maxcolumn; column++){
	for(int row=0; row<maxrow; row++ ){
		int randomNum=0+generator.nextInt(100-0+1);
		System.out.println(random[row][column]+ " ");
	}
	System.out.println();
}

	}

}
