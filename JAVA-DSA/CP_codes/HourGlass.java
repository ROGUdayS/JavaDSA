import java.util.*;

public class HourGlass{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int array[][] =new int[6][6];
         // Input the array
        for(int i=0; i<6;i++){
            for(int j=0; j<6;j++){
                array[i][j]=scan.nextInt();
            }
        }
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<4;i++){
            for(int j=0; j<4;j++){
                int sum = array[i][j]+array[i][j+1]+array[i][j+2]
                                +array[i+1][j+1]
                    +array[i+2][j]+array[i+2][j+1]+array[i+2][j+2];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
        scan.close();
    }
}   
