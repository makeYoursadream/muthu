package basicDemo;

import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		
		int year;
		Scanner scanner = new Scanner(System.in);
		
		year = scanner.nextInt();
		System.out.println("enter the year:"+year);
		scanner.close();
		
		boolean leap = false;
		if(year%4 ==0) {
		
			if(year%100==0) {
				
			if(year %400==0) 
			leap = true;
			else
			leap = false;
			}
			else
				leap=true;
		}
		else
			leap =false;
		
		
		
		if(leap) {
			System.out.println(year+"is a leap year");
			
		}else
			System.out.println(year+"is not a leap year");
	}
	}

