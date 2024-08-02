package july24;
import java.util.Comparator;
public class IdComparator implements Comparator<Employee>  {
  @Override
  public int compare(Employee e1, Employee e2) {
	  if(e1.empID  == e2.empID ) {
			return 0  ;
			
		}else if(e1.empID  > e2.empID) {
		return   1 ;
		}else {
			return -1 ;
		}

  }
}
