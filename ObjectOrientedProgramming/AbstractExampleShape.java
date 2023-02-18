package in.co.objectOrientedProgramming;

/******
 * Abstract Class***** -What code can be written in shape.area()method?
 * --Nothing,area() method is defined by child classes.It should have only
 * declaration.. 
 * -Is shape a concrete class? 
 * --No,Rectangle,Circle,Triangle are
 * concrete classes 
 * 
 * -If it has only area declaration then 
 * --method will be
 * abstract and class will be abstract as well 
 * 
 * -Benefit??
 *  --parent will enforced
 * child to implete area()method 
 * --child has to mandatorily define area method
 * --this will achieve polymorphism
 */
		
		public abstract class AbstractExampleShape {

	int borderWidth=0;
	String color=null;
	
	public abstract double area();

	
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}