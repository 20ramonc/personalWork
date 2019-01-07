package interfaces;
import java.util.ArrayList;
public class Activity3 {

	public static void main(String[] args) {
Student kid = new Student();
Student kid2 = new Student();
Teacher adult = new Teacher();
Teacher adult2= new Teacher();
ArrayList<Person> person = new ArrayList<Person>();
person.add(kid);
person.add(kid2);
person.add(adult);
person.add(adult2);
double length = 0.0;
for(Person ages: person){
	if(ages.getName().length()>10){
		System.out.println(ages.getAge());
	}
	
}
	}

}
