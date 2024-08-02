package practice12july;

public class basic2 {

	public static void main(String[] args) {
		laptop lenovo= new laptop("lenove", "series1", 200000);
		lenovo.installIDE();
		
		laptop asus= new laptop("asus", "series2", 60000.50);
		asus.installIDE();
		
		laptop acer= new laptop("acer", "nitro", 200000);
		acer.installIDE();

	}

}
