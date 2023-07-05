public class recursion_height_equals_n {
    public static int calcPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPowerMinusOne=calcPower(x, n-1);
        int xPower=x*xPowerMinusOne;
        return xPower;
    }
    public static void main(String args[]){
        int x=2, n=5;
        int ans=calcPower(x, n);
        System.out.println(ans);
    }   
}