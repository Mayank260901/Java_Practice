package practice12july;

public class Mobile {
	int camera;
	int battery;
	String displayType;
	double price;
	public Mobile() {
		System.out.println("This is non-Parametarized Constructor");
	}
	public Mobile(int c, int b, String d, double p) {
		camera= c;
		battery=b;
		displayType=d;
		price=p;
		System.out.println("Camera = "+ camera+"Px, Battery = "+battery+ "MaH, displayType = "+displayType+", price= "+ price+"Rs. ");
	}
	public void installApp() {
		System.out.println("The apps are getting installed");
	}
	public int Calculation(int a , int b, int c) {
		return a+b+c;
	} 
}
