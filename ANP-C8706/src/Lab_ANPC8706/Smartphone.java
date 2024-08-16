package Lab_ANPC8706;


public class Smartphone extends Device {
String operatingSystem;
int cameraResolution;

public Smartphone(String brand, String model, String operatingSystem, int cameraResolution) {
   super(brand, model);
   this.operatingSystem = operatingSystem;
   this.cameraResolution = cameraResolution;
}

public void displaySmartphoneInfo() {
   displayInfo();
   System.out.println("Operating System is " + operatingSystem + ", Camera Resolution is " + cameraResolution + " MP");
}

public void takePhoto(boolean mode) {
   if (mode == true) {
       System.out.println("Take picture with " + cameraResolution + " MP camera.");
   } else if(mode == false) {
       System.out.println("The smartphone is switched off. Please power on the device to take a photo.");
   }
}
}
