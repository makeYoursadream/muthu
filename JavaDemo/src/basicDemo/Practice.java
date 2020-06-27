package basicDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {
	
	
	

	public static void AmstronNumber() {
		
		 int num = 153, OrginalNumber , remainder;

		int result =0;
		OrginalNumber = num;
		

		while(OrginalNumber!=0)
		{
			remainder = OrginalNumber %10;
			result += Math.pow(remainder, 3);
			OrginalNumber /= 10;
		}
		if(result == num) {
			System.out.println(num +"its is a AmstronNUmber");

		}else 
			
			System.out.println(num +"its not a amstronNumber");
		
	}
	
	
	private static void FactorialNUm() {
		
		int num = 10;	//1 = 1*1, 1=1*2, 2=2*3
		
		
		long fact = 1;
		
		for(int i=1;i<=num;i++) {
			
			fact *= i ;//
			
			
		}
		System.out.printf("the factorial of"+num+ "is"+fact);
		
	}
	
	private static void StringReve(String str) {
	
		char[] ch = str.toCharArray();
		
		String rev = " ";
		
		for (int i = ch.length-1; i>= 0; i--) {
			
			rev = rev + ch[i];
			
		}
		System.out.println(rev);
		
	}
	
	
	private static void String_rev2(String strg) {
		
		String rev = " ";
		
		String[] st = strg.split(" ");
		
		for(int i=0; i<st.length ;i++) {
			
			char[]ch =st[i].toCharArray();
		for (int j = ch.length-1; j >=0; j--) {
			
			rev = rev + ch[j];
		}	
		    rev = rev + " ";
		}
		System.out.println(rev);
		
	}
	
	private static void rever3(String str) {
		
		String[]split = str.split(" ");
		String rev = " ";
		
		for (int i = split.length-1; i>=0; i--) {
			
			rev = rev + split[i]+" ";
			
		}
		
		System.out.println(rev);

	}
	
	
	private static void drawFlowidTriangle() {

		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5-i ; j++) {
				
				System.out.print(" ");
			}
			
			for (int k = 0; k < i; k++) {
				
				System.out.print("* ");
				
			}
			System.out.println( );
		}
		
	}
	
	private static void Find_duplicate_inString(String word) {

		char[] charactr = word.toCharArray();
		
		Map<Character, Integer> list = new HashMap<Character, Integer>();
		for (char ch : charactr) {
			
			if (list .containsKey(ch)) {
				list.put(ch , list.get(ch)+1);
			}else {
				
				list.put(ch, 1);
			}
		}
		
		Set<Entry<Character, Integer>> set = list.entrySet();
		for (Entry<Character, Integer> entry : set) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey() +" "+entry.getValue());
			}
		}
	}

	
	public static void main(String[] args) {
		// AmstronNumber();
		// FactorialNUm();
		StringReve("java");
		String_rev2("java is easy");
		
		rever3("java project");
		
		//drawFlowidTriangle();
		//Find_duplicate_inString("programing");
	}

}
