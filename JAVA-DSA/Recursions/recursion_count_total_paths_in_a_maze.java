public class recursion_count_total_paths_in_a_maze {
    // Count total paths in a maze to move from(0,0) to (n,m)
    // 1. We can only move right
    // 2. We can move only downward 
    public static int countPaths(int i, int j, int n, int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }
        // Move Downwards
        int downPaths=countPaths(i+1, j, n, m);
        // Move Right
        int rightPaths=countPaths(i, j+1, n, m);

        return downPaths+rightPaths;
    }
    public static void main(String arg[]){
        int n=3,m=3;
        int totalPaths=countPaths(0,0,n,m);
        System.out.println(totalPaths);
    }   
}