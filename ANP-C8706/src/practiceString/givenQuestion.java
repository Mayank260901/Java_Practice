package practiceString;

public class givenQuestion {

	public static void main(String[] args) {
		
		//Write a Java program to convert a String to uppercase using the toUpperCase() method.

		 String s= new String("highschool");
         String a= s.toUpperCase();
         System.out.println(a);
         
         //Write a Java program to concatenate two Strings using the + operator
         String b= "red";
         String c= " keep";
         String d = b+c;
         System.out.println(d);
         
         //Write a Java program to check if a String contains a specific substring using the contains() method.
         if(s.contains("ghsch")) {
        	 System.out.println("true");
         }else {
        	 System.out.println("False");
         }
         
         //Write a Java program to get the length of a String using the length() method.
         System.out.println(s.length());
         
         //Write a Java program to trim the whitespace from a String using the trim() method.
         String e=d.trim();
        
         System.out.println(e);
         
         //Write a Java program to reverse a String.
         StringBuilder m= new StringBuilder("homework");
         m.reverse();
         System.out.println(m);
         
       
         
	}

}
