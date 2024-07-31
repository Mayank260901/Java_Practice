package Lab_ANPC8706;

public class Main {
public static void main(String[] args) {
   
   Smartphone myPhone = new Smartphone("Moto", "g82", "android", 50);
   myPhone.displayInfo();             
   myPhone.displaySmartphoneInfo();   
   myPhone.powerofDevice(true);        
   myPhone.takePhoto(true);                
   myPhone.powerofDevice(false);           
   myPhone.takePhoto(false);                
}
}
