package oOP;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat bob = new Cat ();
System.out.println("age: " + bob.getAge());
bob.setAge(5);
System.out.println("age: " + bob.getAge());
System.out.println("hours slept: " + bob.getSleep());
bob.setSleep(5);
System.out.println("hours slept: " + bob.getSleep());
bob.birthday();
System.out.println("birthday: " + bob.getAge());
bob.SleepMore();
System.out.println("hours slept: " + bob.SleepMore());
bob.SleepLess();
System.out.println("hours slept: " +bob.SleepLess());
	}

}
