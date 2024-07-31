package practice12july2;

public class print {

	public static void main(String[] args) {
		employ emp1= new employ("AN1", "Mayank Bhargava",100000);
		emp1.shiftOut();
		
		
		
		employ emp2 = new employ();
		emp2.shiftIn();
		emp2.display("AN2", " John Wick ", 50000000);

	}

}
