package practice;
public class factorial {

    public static void main(String[] args) {

        int num = 5,num1=10,i = 1;
        long factorial = 1,factorial1=1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
        for(int j=1;j<=num1;j++) {
        	factorial1*=j;
        }
        System.out.printf("\nFactorial of %d = %d", num1, factorial1);
    }
}