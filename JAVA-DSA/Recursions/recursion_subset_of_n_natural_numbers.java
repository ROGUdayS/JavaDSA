import java.util.ArrayList;

public class recursion_subset_of_n_natural_numbers {
    // Print all the subsets of a set of first n natural numbers
    // Time Complexity=O(2^n)
    public static void printSubset(ArrayList<Integer> subset){
        for(int i = 0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }

        // added
        subset.add(n);
        findSubsets(n-1, subset);

        // not added
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    public static void main(String arg[]){
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }   
}