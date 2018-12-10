package wrapperClass;
import java.util.Scanner;
import java.util.ArrayList;
public class foreachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("number of employees" );
int num = input.nextInt();
ArrayList<Double> wage = new ArrayList<Double>();
for(int j =0; j<wage.size(); j++){
	System.out.println("wage");
	wage.add(input.nextDouble());
}
double highest=0;
for(double worker:wage){
	if(worker>highest){
		highest=worker;
	}
}
System.out.println("highest"+ highest);
	}

}
