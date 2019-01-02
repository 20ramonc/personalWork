package designingclasses;
import java.util.ArrayList;
public class Library {
private String name;
private ArrayList<book>Books;

public Library () {
	name="School's Library";
for(int j=0; j<10; j++){
	Books.add(new book());
}
}
public Library (String xname, ArrayList<book>xBooks) {
	name=xname;
	Books=xBooks;
}
public void checkout() {
	for(int j=Books.size()-1; j>=0; j--){
		book remove = Books.remove(1);
	}
}
public void returnbook (){
	Books.add(new book());
}
public void fire () {
	Books.removeAll(Books);
	
}

}