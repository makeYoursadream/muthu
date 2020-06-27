package basicDemo;

import java.util.HashMap;
import java.util.Map;

public class Find_Febonassi {
	
	public static void main(String[] args) {
		
		String str ="Pythan by IntelliJ ";
		
		String[]split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			char[] ch = split[i].toCharArray();
			
			int value = (int)ch[i];
			
			Map<Character, Integer> map =new HashMap<Character, Integer>();
				
				map.containsKey(ch);
				map.containsValue(value);
				
			System.out.println(ch+" "+value);
			
			}	
		}
	}


