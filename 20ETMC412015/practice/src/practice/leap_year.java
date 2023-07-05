package practice;
import java.util.*;
public class leap_year{
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the year :");
			int year=in.nextInt();
			if((year%400==0)||(year%100==0)||(year%4==0))
				System.out.println("Given year is a leap year");
			else
				System.out.println("Given year is not a leap year");
		}
	}
}