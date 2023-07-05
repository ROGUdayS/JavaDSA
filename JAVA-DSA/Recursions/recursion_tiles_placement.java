public class recursion_tiles_placement {
    // Place tiles of size 1*m in a floor of size n*m
    public static int placeTiles(int n, int m){
        // only 2 ways either only vertically or only horizonatlly
        if(n==m){
            return 2;
        }
        // only horizontally as the other way wont fit
        if(n<m){
            return 1;
        }
        // Vertically placed
        int verPlacement=placeTiles(n-m, m);
        // horizontally placed
        int horPlacement=placeTiles(n-1, m);

        return verPlacement+horPlacement;
    }
    public static void main(String arg[]){
        int n=3,m=3;
        System.out.println(placeTiles(n, m));
    }      
}