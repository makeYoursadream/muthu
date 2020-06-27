package mock;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class StringCount {
	
	public static void main(String[] args) {
		
		String s = "Hello java World";
		
		Map<Character, Integer> list =  new HashMap<Character, Integer>();

		
		char[] ch = s.toCharArray();
		
		for (char c : ch) {
			if (list.containsKey(c)) {
				
				list.put(c, list.get(c)+1);
				
			}else {
				
				list.put(c, 1);
			}
		}
		 for (Map.Entry entry : list.entrySet()) { 
	          //  System.out.print(entry.getKey() + " " + entry.getValue()); 
	            
			 
			 
	            System.out.println(entry.getValue()+"="+entry.getKey());
	        } 
		 
		
			
		}
		
	
	}


