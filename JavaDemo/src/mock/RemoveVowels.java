package mock;

public class RemoveVowels {

	public static void main(String[] args) {
		
		String str = "Selenium";
		
		String vouvel = str.replaceAll("[a,e,i,o,u]","");
		
		System.out.println(vouvel);
		
	}
	
}
