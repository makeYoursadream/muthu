package mock;

public class CharFibo {
	
	public static void main(String[] args) {
		
		String str = "kbldbY";
		
		//char[] ch = str.toCharArray();
		
		//char[] ch1 = str.toCharArray();
		
		for (int i = 0; i <str.length(); i++) {
			
			char ch = str.charAt(i);
			
			int num = (int) ch;
			
			//System.out.println(num);
			
		
			int a =0,  b =1 ;
			int count=10;
			
			for (int j = 0; j <= count; j++) {
				
				int temp = a + b;
				//System.out.println(temp);
				a=b;
				b=temp;
				
			
				//System.out.println(temp +" "+num);
		if (num==temp) {
		
			System.out.println(ch);
			}
		
			
			}
			//System.out.println(ch);
			
			}
		
		
	}

	

}
