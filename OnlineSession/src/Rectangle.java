
public class Rectangle extends Shape {

	private double length;
	private double breadth;
	@Override
	public void draw()
	{
		System.out.println("Drawing a Rectangle");
	}
	
	public void getRectangleDetails()
	{
		System.out.println("The length and breadth of this rectangle is "+length + "X"+ breadth);
	}
}
