package arraysList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class rectangleobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
ArrayList<rectangle> boxes = new ArrayList<rectangle>(400);
for(int j =0; j<400; j++){
	boxes.add(new rectangle(50+gen.nextInt(20), (50+gen.nextInt(20))));
}

System.out.println("area for rectangles");
for(int j=boxes.size()-1; j>=0;  j--){
	rectangle box = boxes.get(j);
	System.out.println(j+" "+box.area());
	
}


	}

}
