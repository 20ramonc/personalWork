package Strings;
public class essay {
String text;
String author;
String authorFirstname;
String authorLastname;
boolean x;
int words;
public essay () {
	text="words";
	author="Carli Ramon";
	authorFirstname="Carli";
	authorLastname="Ramon";
	x=false;
	words=1;
}
public void setauthor (String name) {
	author=name;
}

public void settext (String newtext) {
	text=newtext;
}

public String getLastname () {
	author.substring(author.indexOf("") + 1);
return authorLastname.toUpperCase();
}
public int getFirstname() {
	author.substring(0, author.indexOf(""));
	return authorFirstname.length();
}
public boolean X () {
	if(authorFirstname.contains("X") || authorLastname.contains("X")) {
		x=true;
		return x;
	}else {
		x=false;
		return x;
	}
}
public int words () {
for(int counter = 0; counter <text.length(); counter++) {
	if(text.charAt(counter)!= ' ')
		words++;
}
	return words;
	
}
}
