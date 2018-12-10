package arraysList;
import java.util.Scanner;
import java.util.ArrayList;
public class studentnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
ArrayList<String>names=new ArrayList<String>();

for(int j =0; j<=50; j++){
	names.add("names students");
}

if(names.size()>0){
	String remove1=names.remove(0);
}
if(names.size()>0){
	String remove2=names.remove(names.size()-1);
}
System.out.println("names in the array list");
for(int j =0; j<names.size(); j++){
	System.out.println(j+names.get(j));
}
	}

}
