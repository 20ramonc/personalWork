package designingclasses;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class studenttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<studentclass>Student = new ArrayList<studentclass>();
Scanner input = new Scanner(System.in);
System.out.println("number of students");
int students = input.nextInt();
for(int j =0; j<students;j++){
System.out.println("name");
String name = input.nextLine();
studentclass names = new studentclass(name);
input.next();
for(int i =0; i<5; i++){
System.out.println("score");
int score = input.nextInt();
names.addaScore(score);
}
Student.add(names);
}

	}
}

