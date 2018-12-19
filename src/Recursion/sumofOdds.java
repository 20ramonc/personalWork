package Recursion;

public class sumofOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumNum(9));
	}
public static int sumNum (int num){
	if(num>0){
		return (num+sumNum(num-2));
}
	return 0;
	}

	}


