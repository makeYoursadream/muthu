
package basicDemo;

public class Java {
	
	private static void PalindromAreNot(int num) {

	int temp =num , rev ,sum=0;
	
	
	while(num>0) {

	rev=num%10;
	
	sum=(sum*10)+rev;
	
	num=num/10;
	
	}	

	System.out.println(sum);
	if(temp==sum) {
		System.out.println("its a palindrom");
		
	}else 
		System.out.println("not a palindrom");
	
	}
	
	public static String CheckStringisPalindrom(String str) {
		
		String temp =str;
		
		String PalindromOrnot="";
		
		String rev = "";
		
		char[] ch = str.toCharArray();
		
		for(int i = ch.length-1 ; i>=0 ;i--) {
			
			rev = rev + ch[i];
		}
		return PalindromOrnot = rev.equals(temp) ? "Palindrome" : "Not a Palindrome";		
		
		
	}

	
	private static String useInBuiltReversr(String str) {
		
		String temp = str;
		
		String rev = new StringBuffer(str).reverse().toString();
		
		String PalindromAreNot="";
		
		
		return PalindromAreNot = rev.equals(temp) ? "Palindrome" : "Not a Palindrome";
		
		
		
	}
	
	private static int ExtractAndSum(String str) {
		
		int sum = 0;
		
		char[]ch=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(Character.isDigit(ch[i])) {
				
				sum= sum + Character.getNumericValue(ch[i]);
			}
			
			
		}
		return sum;
	
		

	}
	
	private static void Swap_Two_integernumber(int a , int b) {
		
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
		
		
	}
	
	private static void floyd_triangle(int num) {
		
		int count =1;
		
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= i; j++) {
				
			}
			
			System.out.print(count++ +" ");
		}
		System.out.println();
		
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
	
private static void reversePosition(String str) {

	String[] sp = str.split(" ");

	String rev = "";

	for (int i = sp.length - 1; i >= 0; i--) {

		rev = rev + sp[i]+" ";

	}

	System.out.println(rev);

}
	
	public static void main(String[] args) {
		
		PalindromAreNot(152);
		System.out.println("Given String "+CheckStringisPalindrom("flipkart"));
		System.out.println("Given String"+useInBuiltReversr("amma"));
		ExtractAndSum("45fdafv86afe54");
		System.out.println("sum is "+ExtractAndSum("bviuwb15492vdsv51"));
		Swap_Two_integernumber(10, 5);
		floyd_triangle(10);
		String_rev2("java is easy");
		reversePosition("java project");
	}
}


