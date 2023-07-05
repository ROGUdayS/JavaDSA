import java.util.Scanner;
public class plusMinus{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int plus=0,minus=0,zero=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>0){
                plus++;
            }
            else if (arr[i]<0){
                minus++;
            }
            else{
                zero++;
            }
        }
        double plus_avg=plus/n;
        double minus_avg=minus/n;
        double zero_avg=zero/n;
        System.out.println(plus_avg);
        System.out.println(minus_avg);
        System.out.println(zero_avg);
        sc.close();
    }
}