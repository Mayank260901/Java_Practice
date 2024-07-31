package practice12july2;

public class employ {
            String Id ;
            String name;
            int Salery;
            
            public employ() {
            	System.out.println("This is default Constructor of employ class");
            	
            }
            public employ(String i, String n, int s) {
            	Id = i;
            	name= n;
            	Salery= s;
            	System.out.println("ID = "+Id+", name= "+name+", Salery = "+Salery+"Rs.");
            }
            public void shiftIn() {
            	System.out.println("The employ's shift is ON");
            }
            public void shiftOut() {
            	System.out.println("The employ's shift is OFF");
            }
            
            public void display(String i, String n, int s) {
            	Id = i;
            	name= n;
            	Salery= s;
            	System.out.println("ID ="+Id+", name= "+name+", Salery = "+Salery+"Rs.");
            }
}
