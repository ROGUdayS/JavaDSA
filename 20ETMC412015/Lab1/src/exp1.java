import java.util.Scanner;
public class exp1{
	public static void main(String[] args) {
		int j=1;
		Scanner input = new Scanner(System.in);
		while(j!=0) {
			System.out.println("\n\n------Welcome to Experiment 1------");
			System.out.println("Enter Operations to be performed :");
			System.out.println("1.Check whether a number is Armstrong or not\n"
					+ "2.Reverse a input number using for loop\n"
					+ "3.Reverse a input number using while loop\n"
					+ "4.Read N numbers extract Odd and find their average\n"
					+ "5.Check wheter a year is leap or not");
			int value=input.nextInt();
			switch (value) {
			case 1:
				int num,number,temp,total=0;
				System.out.println("Enter the number to be checked :");
				num=input.nextInt();
		        number = num;
		        while (number != 0)
		        {
		            temp = number % 10;
		            total = total + temp*temp*temp;
		            number /= 10;
		        }
				if(total==num)
					System.out.println("The entered Number "+num+" is an Armstrong Number");
				else
					System.out.println("The entered Number "+num+" is not an Armstrong Number\n");
				break;
			case 2:
				System.out.println("Enter the number to be reversed :");
				num=input.nextInt();
				int result=0;
				for(int i=num;i>0;i/=10) {
					int n=i%10;
					result=result*10+n;
				}
				System.out.println("The reverse of the number "+num+" is :"+result);
				break;
			case 3:
				System.out.println("Enter the number to be reversed :");
				num=input.nextInt();
				temp=num;
				result=0;
				while(temp!=0) {
					int n=temp%10;
					result=result*10+n;
					temp/=10;
				}
				System.out.println("The reverse of the number "+num+" is :"+result);
				break;
			case 4:
				int sum=0,i=0,count=0;
				System.out.println("Input N numbers :");
				num=input.nextInt();
				System.out.println("The odd numbers from the set are :");
				for(i=1;i<=num;i++) {
					if(i%2!=0) {
						count+=1;
						System.out.println(i+"");
						sum+=1;
					}
				}
				int avg=sum/count;
				System.out.println("Sum of odd numbers "+sum);
				System.out.println("The average of odd natural numbers upto "+num+" terms is : "+avg);
				break;
			case 5:
				System.out.println("Enter the year :");
				int year=input.nextInt();
				if((year%400==0)||(year%100==0)||(year%4==0))
					System.out.println("Given year is a leap year");
				else
					System.out.println("Given year is not a leap year");
				break;
			default:
				j=1;
				break;
			}
		}
	}
}