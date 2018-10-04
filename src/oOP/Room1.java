package oOP;

public class Room1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Area closet = new Area ();
Area kitchen = new Area ();
kitchen = closet;
Area basement = new Area ();
closet = basement;
closet.room();
	}

}
