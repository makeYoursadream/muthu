package mock;

import java.util.Arrays;

public class AnaGram {
	
	public static void main(String[] args) {
		
		String str1 = "Army peak";
		String str2 = "mary keep";
		
//		String s1 = str1.replace("\\s", "");
		
//		String s2 = str2.replace("\\s", "");
		
		//boolean status = true;
		
		if(str1.length()==str2.length()) {
			
			
			
		
			
			char[] ar1= str1.toLowerCase().toCharArray();
			char[] ar2 = str2.toLowerCase().toCharArray();
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			
		
		if( Arrays.equals(ar1, ar2)) {
			
			System.out.println(str1+" "+str2 + " it is anagrm");
			
		}else {
			
			System.out.println(str1+" "+str2+ "its no an anagram");
		}
		
	}
	
}

}
