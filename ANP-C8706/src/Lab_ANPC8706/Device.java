package Lab_ANPC8706;


public class Device {
String brand;
String model;
boolean mode;

public Device(String brand, String model) {
   this.brand = brand;
   this.model = model;
   this.mode = false;
}

public void displayInfo() {
   System.out.println("Brand = " + brand + ", Model = " + model);
}

public void powerofDevice(boolean mode) {
  if( mode == true) {
   System.out.println(brand + " " + model + " is switched on.");
}else if(mode == false) {
   System.out.println(brand + " " + model + " is switched off.");
}
}
}