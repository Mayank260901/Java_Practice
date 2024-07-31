package practice12july;

public class Basic {

	public static void main(String[] args) {
		Mobile oppo = new Mobile();
		oppo.installApp();
		int Calculate =oppo.Calculation(5, 7, 8);
		System.out.println(Calculate);
		
		
		Mobile vivo= new Mobile(50 , 5000, "Amoled", 18000.00);
        vivo.installApp();
        
        Mobile redmi= new Mobile(64, 5200, "full HD", 30000);
        int Cal = redmi.Calculation(55, 50, 20);
        System.out.println(Cal);
        
        Mobile honor= new Mobile(20, 3000, "curved", 8000);
        int calc = honor.Calculation(55, 50, 20);
        System.out.println(calc);
        
        Mobile Moto = new Mobile(128, 6000, "Good", 40000);
        int calcu = Moto.Calculation(50,50,62);
        System.out.println(calcu);
;	}

}
