package basicDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class print_num {

	public static void main(String[] args) {
		
		String str = "java Worlddd";
		
Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] ch = str.toCharArray();
		
		for(Character cha : ch) {
			if(map.containsKey(cha)) {
				map.put(cha, map.get(cha)+1);
			}else
				map.put(cha, 1);
			
		}
		Set<Entry<Character,Integer>> set =	map.entrySet();
			
			for (Entry<Character, Integer> entry : set) {
				
				int num = entry.getValue();
				
				System.out.println(num);
			}
	}
	
}
