package practice12july;

public class vehicle {
	private String model;
	private String CompanyName;
	private int price;
	
	public vehicle() {}
	
	public vehicle(String model, String CompanyName, int price ) {
		this.setModel(model);
		this.setCompanyName(CompanyName);
		this.setPrice(price);
	}
	
	@Override
	public String toString() {
		return "vehicle [model=" + model + ", CompanyName=" + CompanyName + ", price=" + price + "]";
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		
		
		
		
	}
	
	

}
