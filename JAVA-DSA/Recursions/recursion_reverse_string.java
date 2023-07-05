public class recursion_reverse_string {
    public static void printReverseString(String str, int indx){
        if(indx==0){
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printReverseString(str, indx-1);
    }
    public static void main(String args[]){
        String str = "abcd";
        printReverseString(str, str.length()-1);
    }
}