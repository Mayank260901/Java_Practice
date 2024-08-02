package july24;

public class Employee {

public int empID;
public String name;
public double salary;
 public Employee(int empID , String name , double salary) {
	this.empID = empID;
	this.name = name;
	this.salary = salary;
 }
 
 @Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}

}
