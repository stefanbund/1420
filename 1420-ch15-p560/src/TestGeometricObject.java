
public class TestGeometricObject {

	/**
	 * 
	 * model the programming framework we wish to deliver, by laying some incomplete objects, methods
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//create 2 geometric object
		GeometricObject geoObject1 = new Circle(5);
		GeometricObject geoObject2 = new Rectangle(5.0,3.0);
		
System.out.println("The two object have the same area? " + equalArea(geoObject1, geoObject2));
		//@TODO !!
		displayGeometricObject(geoObject1);
		displayGeometricObject(geoObject2);
	}//end main
	
	private static void displayGeometricObject(GeometricObject object) 
	{
		System.out.println();
		System.out.println("the area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}

	public static boolean equalArea(GeometricObject object1, GeometricObject object2 )
	{
		return object1.getArea() == object2.getArea();
	}
	
	

}
