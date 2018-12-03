package multiarrays;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int maxrow=9;
final int maxcolumn=14;
int [] [] random = new int [maxrow][maxcolumn];

for(int column=0; column<maxcolumn; column++){
	for(int row=0; row<maxrow; row++ ){
		System.out.println(random[row][column]+ " ");
	}
	System.out.println();
}

	}

}
