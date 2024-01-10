import java.util.concurrent.RecursiveAction;

public class Run {
	
	public static void show(Shape s)
	{
		if(s instanceof Circle)
		{
			Circle c = (Circle) s;
			c.getCirlceDetails();
		}
		
		else if( s instanceof Rectangle)
		{
			Rectangle r = (Rectangle) s;
			r.getRectangleDetails();
		}
	}
	
	
	public static void main(String[] args) {
		
		//upcasting
		Shape s = new Circle();
		
		show(s);
		
		s = new Rectangle();
		show(s);
		
		
		
		
		
	}
}
