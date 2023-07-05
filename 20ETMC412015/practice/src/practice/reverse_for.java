package practice;

import java.util.*;
public class reverse_for{
	public static void main(String[] args) {
		int num,rev=0,rem;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the number to be reversed :");
			num=input.nextInt();
		
		for(;num!=0;num/=10) {
			rem=num%10;
			rev=rev*10+rem;
		}
		System.out.println("The reverse of the number "+num+" is :"+rev);
		}catch(InputMismatchException e) {
			System.out.println("Not Valid");
		}
}
}