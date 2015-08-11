
public class SortRectangles {

	public static void main(String[] args) 
	{
		
		ComparableRectangle[] rectangles = {
				new ComparableRectangle(3.4, 5.4),
				new ComparableRectangle(13.24 , 55.4),
				new ComparableRectangle(7.4, 35.4),
				new ComparableRectangle(1.4, 25.4)};
		
		java.util.Arrays.sort(rectangles);
		
//		for(Rectangle rectangle : rectangles){
//			System.out.println(rectangle +  " ");
//			System.out.println();
//		}
	//	for(int i = 0 ; i < rectangles.length; i++)
//		{
//			int limit = rectangles.length - 1;
//			//System.out.println("rectangle " + i + " with: " + rectangles[i] + "\n");
//			System.out.println("the largest rectangle is #" + 
//			rectangles.length +  " with dimensions " + 
//			rectangles[limit]); 
//		}
		int limit = rectangles.length - 1;
		System.out.println("the largest rectangle is #" + 
				rectangles.length +  " with dimensions " + 
				rectangles[limit]); 

	}

}
