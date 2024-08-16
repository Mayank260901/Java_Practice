package Homework1;
import java.util.*;
public class FrequencyCount {
	 public static void main(String[] args) {
	        String[] fruit = {"apple", "banana", "banana", "orange", "banana", "apple", "orange", "orange"};
	      Map<String, Integer> freq = new HashMap<>();

	        for (String fruits : fruit) {
	        	
	        	//in place of if- else we also can getOrDefault
	        	// freq.put(fruits, freq.getOrDefault(fruits,0) +1);
	            if(freq.containsKey(fruits)) {
	            	freq.put(fruits, freq.get(fruits)+1);
	            }else {
	            	freq.put(fruits,1);
	            }
	        }

	        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue());
	        }
	    }
}
