package oOP;

public class EmployeeTest {

	public static void main(String[] args) {
Employee bob = new Employee();
System.out.print(bob.getWage());
bob.setWage(16.55);
System.out.println(bob.getWage());
Employee bob2 = new Employee();
System.out.print(bob2.getExperience());
bob.setExperience(4);
System.out.println(bob.getExperience());

	}

}
