package Recursion;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sumNum(10));
	}
public static int sumNum (int num){
	if(num>1){
		return (num+sumNum(num-1));
}
	return 0;
	}

}
