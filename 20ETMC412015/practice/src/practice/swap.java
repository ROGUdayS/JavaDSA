package practice;
import java.util.*;
public class swap{
	public static void main(String[] args) {
		try (Scanner in = new Scanner (System.in)) {
			int x, y, t;// x and y are to swap   
			   System.out.println("Enter the value of X and Y");  
			   x = in.nextInt();  
			   y = in.nextInt();
			   System.out.println("before swapping numbers: "+x +"  "+ y);  
			   /*swapping */  
			   t = x;  
			   x = y;  
			   y = t;  
			   System.out.println("After swapping: "+x +"   " + y);
		System.out.println( );
		}catch(InputMismatchException e) {
			System.out.println("Not Valid");
		}
	}
}