public class recursion_tower_of_hanoi{
    // time complexity O(2^n - 1)
    public static void towerOfHanoi(int n , String src, String hlpr, String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, hlpr);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, hlpr, src, dest);
    }
    public static void main(String args[]){
        int n=3;
        towerOfHanoi(n,"S","H","D");
    }
}