public class recursion_first_and_last_occurence {
    // Time Complexity O(n)
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int indx, char element){
        if(indx==str.length()){
            System.out.println("first occurence at " + first);
            System.out.println("last occurence at " + last);
            return;
        }
        if(element==str.charAt(indx)){
            if(first==-1){
                first=indx;
            }
            else{
                last=indx;
            }
        }
        findOccurance(str, indx+1, element);
    }
    public static void main(String args[]){
        String str="abaacdaefaah";
        findOccurance(str,0,'a');
    }
}