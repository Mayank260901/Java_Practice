package practice12july;

public class Rectangle extends Shape {
	@Override
	public int getArea() {
		int length= 10;
		int breadth = 20;
		super.getArea();
		return length*breadth;
	}
	

}


