package wrapperClass;
import java.util.Scanner;
public class nameAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("number if students in class");
int num = input.nextInt();
int[] ages = new int [num];
for(int j=0; j<ages.length;j++){
	System.out.println("age"+ (j+1));
	ages[j] =input.nextInt();
}
double avg=0.0;
double total=0;
for(int j:ages){
	total+=j;
	}
avg=total/(double)num;

	System.out.println("avg age of students in class "+ avg);
	}
}

