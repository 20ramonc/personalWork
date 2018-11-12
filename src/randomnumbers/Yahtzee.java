package randomnumbers;
import java.util.Random;
public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();
int randomNum=0;
int min=1;
int max=6;
int one=0;
int two=0;
int three=0;
int four=0;
int five=0;
int yahtzee=0;
int rolls=0;
do{
	for(int counter=1; counter<=5; counter++) {
		randomNum=min + generator.nextInt()*(min-max+1);
		if(randomNum==1){
			one++;
	}
	if(randomNum==2) {
		two++;
	}
	if(randomNum==3) {
		three++;
	}
	if(randomNum==4) {
		four++;
	}
	if(randomNum==5) {
		five++;
	}
	}
if(one==5||two==5||three==5||four==5||five==5) {
	System.out.println("Yahtzee!");
	rolls++;
}else {
	System.out.println("roll again");
	rolls++;
	
}
}while(yahtzee!=1);
	System.out.println(rolls+"rolls");
}
}
	

	
	

