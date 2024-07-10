package oops;

public class Student {
          String name = "xyz" ;
          int rollNo= 20;
          int age= 20 ;
        
         public Student() {
        	  System.out.println("the name of the student is " + this.name+ " of "+ this.age +"yrs and rollno. "+ this.rollNo);
          }
          public void percentage(int maths , int english, int hindi ,int science, int sst, int computer) {
        	  int percent = (maths + english + hindi + science + sst + computer)/6;
        	  System.out.println("The class 10th result of " + this.name+ " of "+ this.age +"yrs and rollno. "+ this.rollNo +"is = " + percent  );
        	
          }
          public void percentage(int maths , int english, int physics ,int chemistry, int computer) {
        	  int percent = (maths + english + physics + chemistry + computer )/5;
        	  System.out.println("The class 12th result of " + this.name+ " of "+ this.age +"yrs and rollno. "+ this.rollNo +"is = " + percent  );
          }
          
          
}
