
public class Circle extends GeometricObject {

	private double radius; 

	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(String color, boolean filled) {
		super(color, filled);
	}

	public Circle(int i) {
		this.radius = i; 
	}

	@Override
	public double getArea() 
	{
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius;
	}

}
