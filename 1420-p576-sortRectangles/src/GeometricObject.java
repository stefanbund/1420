/**
 * geometric is instantiated dynamically, without the 'new' keyword
 * 
 * @author stefanbund
 *
 */
public abstract class GeometricObject {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated; 

	/**
	 * @return the dateCreated
	 */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the filled
	 */
	public boolean isFilled() {
		return filled;
	}

	/**
	 * @param filled the filled to set
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * constructor: first method thrown when an object of this type is instantiated
	 */
	public GeometricObject() 
	{
		setDateCreated(new java.util.Date());//calling the constrcutor of the Date class
	}
	
	/**
	 * @return the color
	 */
	public String getColor() 
	{
		return color;
	}

	/**
	 * @param color -- specify the color to set
	 */
	public void setColor(String color) 
	{
		this.color = color;
	}

	/**
	 * pay attention to how protected classes work
	 * @param color
	 * @param filled
	 */
	protected GeometricObject(String color, boolean filled)
	{
		setDateCreated(new java.util.Date());
		this.setColor(color);
		this.setFilled(filled); 
	}
	
	
	@Override
	public String toString()
	{
		return "created on " + dateCreated + "\n color: " + color + " and filled:"+  filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();//must run this
	
	

}
