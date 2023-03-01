package in.co.ImmutableClass;


//an immutable class can be created by following steps:
	
//	1. make class final so that child class cannot be made.
//	2. make all attributes private and final. 
//	3. Define parameterized Constructor to initialize final attributes. 
//	4. Define only getter methods to fetch the attributes. 
//


public final class Rectangle {
private final int length;
private final int width;

public Rectangle(int length,int width) {
	this.length = length;
	this.width = width;	
}
public int getLength() {
	return length;
}
public int getWidth() {
	return width;
}
public float area() {
	float area=getLength()*getWidth();
	return area;
}
}
