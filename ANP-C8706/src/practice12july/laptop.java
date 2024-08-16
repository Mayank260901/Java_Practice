package practice12july;

public class laptop {
	String company_Name;
	String model_Name;
	double price;
	
	 public laptop() {}
	
	public laptop(String c, String m, double p) {
		company_Name = c;
		model_Name = m;
		price = p;
		
	System.out.println("The laptop of "+ company_Name+" model = "+ model_Name+" has cost price = " +price);
		
	}
	
	public void installIDE() {
		System.out.println("Eclipse IDE is installed successfully");
	}
	

}
