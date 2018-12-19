package designingclasses;
import java.util.ArrayList;
public class harddrive {
private String name;
private ArrayList<Double> files;
private double totalcapacity;
private double freespace;

public harddrive(){
	name="name";
	files=new ArrayList<Double>();
	totalcapacity=100.0;
	freespace=100.0;
}
public harddrive(String xname, ArrayList<Double> xfiles, double xtotalcapacity, double xfreespace){
	name=xname;
	files=xfiles;
	totalcapacity=xtotalcapacity;
	freespace=xfreespace;
}
public void addfile(double Files){
	files.add(Files);
}
public void deletefile(double index){
	files.remove(index);
}
public boolean isFull(){
	if(freespace==0){
	}
	return true;
	}
public boolean isEmpty(){
	if(freespace==totalcapacity){
	}
	return true;
}
}