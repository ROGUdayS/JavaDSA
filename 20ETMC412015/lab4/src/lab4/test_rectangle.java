package lab4;
import java.util.*;
public class test_rectangle{
	public static void main(String[] args) {
		rectangle obj=new rectangle();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length and width in range of 0.0 and 20.03");
		System.out.println("Enter the length :");
		obj.setlength(in.nextDouble());
		System.out.println("Enter the width :");
		obj.setWidth(in.nextDouble());
		if(rectangle.flag==0) {
			System.out.println("The are of the rectangle is :"+obj.area());
			System.out.println("The perimeter of the rectangle is :"+obj.perimeter());
		}
	}
}