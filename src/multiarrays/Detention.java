package multiarrays;
import java.util.Scanner;
public class Detention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Student [][] students = new Student[2][2];
for(int j=0; j<students.length; j++){
	for(int r=0; r<students[0].length; r++){
		System.out.println("name");
		String name = input.nextLine();
		students[j][r].setName(name);
		System.out.println("grade");
		int grade =input.nextInt();
		if(grade<9||grade>12){
			System.out.println("enter a grade from 9-12");
			int xgrade=input.nextInt();
			xgrade=grade;
			students[j][r].setGrade(grade);
			
		}
	}
}int length=0;
double avg=0.0;
int ninth=0;
int twelfth=0;
double percent=0.0;
for(int j=0; j<students.length; j++){
	for(int r=0; r<students[0].length; r++){
		length+=students[j][r].getName().length();
		if(students[j][r].getGrade()==9){
			ninth++;
		}
		if(students[j][r].getGrade()==12){
			twelfth++;
		}
	}
	}
avg=length/4;
percent=(twelfth/4)*100;
System.out.println("avg length of student names: "+ avg+ "\n"+ ninth+ " 9th graders"+percent +"% of 12th graders");
	}

}
