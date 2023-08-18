package FacePrep;

import java.util.Scanner;
import java.util.Vector;

public class primeNumbersSegmentedSieve {
    static void simpleSieve(int limit, Vector<Integer> prime){
        boolean mark[]=new boolean[limit+1];
        for(int i=0;i<=mark.length; i++){
            mark[i]=true;
        }
        for(int p=2;p*p<limit;p++){
            if(mark[p]==true){
                for(int i=p*p;p<limit;i+=p){
                    mark[i]=false;
                }
            }
        }

        for(int p=2;p<limit;p++){
            if(mark[p]==true){
                System.out.print(p+" ");
            }
        }
    }
    static void segmentedSieve(int n){
        int limit = (int)(Math.floor(Math.sqrt(n))+1);
        Vector<Integer> prime = new Vector<>();
        simpleSieve(limit, prime);

        int low=limit;
        int high=2*limit;

        while(low<n){
            if
        }
    }
}