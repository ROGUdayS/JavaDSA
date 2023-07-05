import java.util.Scanner;
import java.lang.Math;
public class diagonalDifference{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int sum_a=0,sum_b=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                
            }
        }
        for(int i=0,j=n-1;i<n;i++,j--){
            sum_a+=arr[i][i];
            sum_b+=arr[i][j];
        }
        int absolute=sum_a-sum_b;
        System.out.println(Math.abs(absolute));
        sc.close();
    }
     
}