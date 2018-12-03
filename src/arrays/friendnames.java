package arrays;
import java.util.Scanner;
public class friendnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
String [] names= new String[10];
for(int j =0; j<names.length;j++){
	System.out.println("name");
	names[j]=input.nextLine();
}String letters = input.nextLine(); 
char letter=letters.charAt(0);
for(int j =0; j<names.length;j++){
	int nLenght=(names[j].length());
	int lastletter=names[j].charAt(nLenght)-1;
	if(lastletter==letter);
		System.out.print(names[j]);
}
	}

}
