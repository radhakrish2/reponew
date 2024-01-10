
public class Circle extends Shape {

	int radius =10;
	@Override
	public void draw()
	{
		System.out.println("Drawing a Circle");
	}
	
	@Override
	public void fun()
	{
		System.out.println("private function in Circle");
	}
	
	public void getCirlceDetails()
	{
		System.out.println("The radius of this circle is "+radius);
	}
}
