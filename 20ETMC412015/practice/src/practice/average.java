package practice;
import java.util.*;
public class average {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int i,n,sum=0;
			System.out.println("Input N numbers :");
			n=in.nextInt();
			System.out.println("The odd numbers from the set are :");
			for(i=1;i<=n;i++) {
					System.out.println(2*i-1);
					sum+=(2*i-1);
			}
		System.out.println("Sum of odd numbers "+sum);
		System.out.println("The average of odd natural numbers upto "+n+" terms is : "+sum/n);
		}
	}
}