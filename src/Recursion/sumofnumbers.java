package Recursion;

public class sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumNum(6));
	}
public static int sumNum (int num){
	if(num>0){
		return (num+sumNum(num-1));
}
	return 0;
	}

}
