package Lab4;
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a list of strings: ");
	        String input = sc.nextLine();

	        
	        TreeSet<String> treeSet = new TreeSet<>();
	        String[] words = input.split(" ");
	        for (String word : words) {
	            treeSet.add(word);
	        }
	        System.out.println(treeSet);
	        sc.close(); // used it because of scanner sc was giving recommendation.
	    }
	}