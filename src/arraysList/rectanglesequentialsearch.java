package arraysList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class rectanglesequentialsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random gen = new Random ();
int width=0;
ArrayList<rectangle>objects=new ArrayList<rectangle>();
for(int j =0; j<100; j++){
	rectangle bob = new rectangle(gen.nextInt(500),(gen.nextInt(500)));
}
for(int j =0; j<objects.size()-1; j++){
	System.out.println(objects.get(j).getWidth());
	if(objects.get(j).getWidth()==10){
		width++;
	}
}
System.out.println(width);
	}

}
