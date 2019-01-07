package arraysList;

public class rectangle2 {
	private int length;
	private int width;
	public rectangle2(int xLength, int xWidth)
	{
	length = xLength;
	width = xWidth;
	}

	public int returnLength()
	{
	return length;
	}
	
	public int returnWidth()
	{
	return width;
	}
	public double returnArea()
	{
	double area = length*width;
	return area;
}
}