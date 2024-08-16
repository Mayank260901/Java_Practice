package practice12july;

public class basic3 {
public static void main(String args[]) {
	vehicle tata= new vehicle("nano","tata", 500000);
	
	System.out.print(tata.getCompanyName() +", ");
	System.out.print(tata.getModel() +", ");
	System.out.println(tata.getPrice());
	
	System.out.println(tata);
	
vehicle swift= new vehicle("dzire","swift", 1000000);
	
	System.out.print(swift.getCompanyName() +", ");
	System.out.print(swift.getModel() +", ");
	System.out.println(swift.getPrice());
	
vehicle maruti= new vehicle("800","maruti", 200000);
	
	System.out.print(maruti.getCompanyName() +", ");
	System.out.print(maruti.getModel() +", ");
	System.out.println(maruti.getPrice());
	
}
}
