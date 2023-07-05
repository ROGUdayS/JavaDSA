import java.util.HashSet;

public class recursion_subsequences_of_a_unique_string_using_hashset {
     public static void subSequences(String str, int indx, String newSubString, HashSet<String> set){
        if(indx==str.length()){
            if(set.contains(newSubString)){
                return;
            }
            else{
                System.out.println(newSubString);
                set.add(newSubString);
                return;
            }
        }
        char currChar=str.charAt(indx);
        //to be
        subSequences(str, indx+1, newSubString+currChar, set);
        //not to be
        subSequences(str, indx+1, newSubString, set);
    }
    public static void main(String args[]){
        String str="aaa";
        HashSet<String> set =new HashSet<>();
        subSequences(str, 0, "", set);
    }
}