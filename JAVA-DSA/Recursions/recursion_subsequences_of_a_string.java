public class recursion_subsequences_of_a_string {
    public static void subSequences(String str, int indx, String newSubString){
        if(indx==str.length()){
            System.out.println(newSubString);
            return;
        }
        char currChar=str.charAt(indx);
        //to be
        subSequences(str, indx+1, newSubString+currChar);
        //not to be
        subSequences(str, indx+1, newSubString);
    }
    public static void main(String args[]){
        String str="abc";
        subSequences(str, 0, "");
    }
}