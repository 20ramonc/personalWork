package multiarrays;
import java.util.Scanner;
public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int students=0;
		double height=0;
		double avg=0;
		int [][] holes = new int [2][3];
		for(int r =0; r<holes.length; r++){
			for(int c=0; c<holes[0].length; c++){
				System.out.println("height");
				holes[r][c]=input.nextInt();
				
			}
		}double tallest=0.0;
		double smallest=10000.0;

		for(int r =0; r<holes.length; r++){
			for(int c=0; c<holes[0].length; c++){
				if(holes[r][c]!=0){
					students++;
				}
				if(holes[r][c]>tallest){
					tallest=holes[r][c];
				}
				if(holes[r][c]<smallest&&holes[r][c]!=0){
					smallest=holes[r][c];
				}
					height+=holes[r][c];
					System.out.println(holes[r][c]+ " ");
			}
			System.out.println();
			}
		avg=height/students;
		System.out.println("overall average height of the students"+ avg +"\n tallest student" + tallest+ "\nshortest student"+ smallest);

			}
			
	}


