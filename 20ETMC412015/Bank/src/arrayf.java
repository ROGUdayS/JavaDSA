import java.util.*;
public class arrayf{
	static int removeduplicates(int a[],int n) {
		if(n==0||n==1) {
			return n;
		}
		int[] s = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				s[j++]=a[i];
			}
		}
		s[j++]=a[n-1];
		for(int i=0;i<j;i++) {
			a[i]=s[i];
		}
		return j;
	}
	public static void main(String[] args) {
		int[] a= {1,2,4,5,2,3,7,6,7,4};
		Arrays.sort(a);
		int n=a.length;
		n=removeduplicates(a,n);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
}