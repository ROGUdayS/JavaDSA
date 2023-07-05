package practice;
import java.util.*;
	public class reverse{
		public static void main(String[] args) {
			int num,rev=0,rem;
			try (Scanner input = new Scanner(System.in)) {
				System.out.println("Enter the number to be reversed :");
				num=input.nextInt();
			
			while(num!=0) {
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			System.out.println("The reverse of the number "+num+" is :"+rev);
			}catch(InputMismatchException e) {
				System.out.println("Not Valid");
			}
	}
}