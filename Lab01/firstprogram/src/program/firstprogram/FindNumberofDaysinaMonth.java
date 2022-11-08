package firstprogram;
import java.util.Scanner;

public class FindNumberofDaysinaMonth {
	private static Scanner sc;
	public static void main(String[] args) {
		
		int month;
		sc = new Scanner(System.in);
		
		System.out.println("Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec): ");
		month = sc.nextInt();	
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
			System.out.println("\n31 Days in this Month");  	
		}
		
		else if (month == 4 || month == 6 || month == 9 || month == 11 ){
			System.out.println("\n30 Days in this Month");  	
		} 
		
		else if (month == 2 ){
			System.out.println("\nEither 28 or 29 Days in this Month");  	
		}
		
		else
			System.out.println("\nEnter Valid Number between 1 to 12");
	}
}
//i can't  ;')) just make it simple