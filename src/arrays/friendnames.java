package arrays;
import java.util.Scanner;
public class friendnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
String [] names= new String[10];
for(int j =0; j<names.length;j++){
	System.out.println("name");
	names[j] = input.nextLine();
}
System.out.println("reverse order");
for(int j =names.length-1; j>=0;j++){
	System.out.println(names[j]);
}
System.out.println("Program over");
	}

}
