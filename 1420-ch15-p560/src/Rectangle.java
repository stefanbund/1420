
public class Rectangle extends GeometricObject {

	private double width; 
	private double height; 
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String color, boolean filled) {
		super(color, filled);
	}

	public Rectangle(double i, double j) 
	{
		this.width = i; 
		this.height = j; 
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
