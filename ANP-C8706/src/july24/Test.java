package july24;
import java.util.*;
public class Test {
public static void main(String[] args) {
	ArrayList<Employee> list = new ArrayList<Employee>();
	list.add(new Employee(101, "piyush", 50000));
	list.add(new Employee(104, "mayank", 50600));
	list.add(new Employee(103, "pankaj", 51000));
	list.add(new Employee(102, "prerna", 554000));
	list.add(new Employee(105, "rohit", 503000));
	
	Collections.sort(list,new IdComparator());
	
	for(Employee e : list) {
		System.out.println(e);
	}
}
}
