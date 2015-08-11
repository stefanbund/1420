
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

	public ComparableRectangle(double width, double height) 
	{
		super(width, height);
	}

	@Override
	public int compareTo(ComparableRectangle o) 
	{
		if(getArea() > o.getArea())
			return 1; //for true
		else if ( getArea() < o.getArea())
			return -1; //false
		else
			return 0; //must return data of type integer
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " area: " + getArea() + " and perimeter: " + getPerimeter();
	}
	
	

}
