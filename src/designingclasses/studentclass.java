package designingclasses;
import java.util.ArrayList;

public class studentclass {
private String name;
private ArrayList<Integer>tests;
private int howmany;

public studentclass (){
	name="bob smith";
for(int j =0; j<5; j++){
	tests.add(50);
}
	howmany=0;
}
public studentclass (String xname){
	name=xname;
	
}
public void addaScore(int score){
	tests.add(score);
}
public double averageScore(){
	int num=0;
	double avg=0;
	for(int j =0; j<5; j++){
		tests.add(50);
		num+=tests.get(j);
		if(tests.get(j)>0){
			howmany++;
		}
		avg=(num+=tests.get(j))/howmany;
		
	}
	return avg;
	
}
public int lowestscore(){
	int lowest=1000;
	for(int j =0; j<5; j++){
		tests.add(50);
		if(tests.get(j)>lowest){
			lowest=tests.get(j);
		}
	}
	return lowest;
}
public String toString (){
	return "Student name: "+ name+ " how many valid test scores"+ howmany;
}
public studentclass clone () {
	return new studentclass(name);
}
public boolean equals (studentclass other) {
	return (this.toString().equals(other.toString()));
}

}

