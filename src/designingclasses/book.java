package designingclasses;

public class book {
private String title;
private int pages;

public book () {
	title="title";
	pages=1000000;
}
public book(String xtitle, int xpages){
	title=xtitle;
	if(pages>0){
		xpages=pages;
	}else{
		pages=xpages;
	}
}
public String getTitle(){
	return title;
}
public int getPages () {
	return pages;
}
public String toString(){
	return "Book object: title= " + title + " number of pages= "+ pages;
}
public boolean equals(book otherObject){
	return(this.toString().equals(otherObject.toString()));
}
public book clone() {
	return new book(title,pages);
}
}