public class recursion_remove_duplicates {
    // time complexity = O(n)
    public static boolean[] map=new boolean[26];
    public static void removeDuplicates(String str, int indx, String newString){
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(indx);
        if(map[currChar-'a']){
            removeDuplicates(str, indx+1, newString);
        }else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, indx+1, newString);
        }
    }
    public static void main(String args[]){
        String str="abbccda";
        removeDuplicates(str,0, "");
    }
}