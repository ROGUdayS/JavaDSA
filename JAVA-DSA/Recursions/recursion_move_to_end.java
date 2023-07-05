public class recursion_move_to_end {
    //Time Complexity=O(n)
    public static void moveAllX(String str,int indx, int count, String newString){
        if(indx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.print(newString);
            return;
        }
        if(str.charAt(indx)=='x'){
            count++;
            moveAllX(str, indx+1, count, newString);
        }
        else{
            newString+=str.charAt(indx);
            moveAllX(str, indx+1, count, newString);
        }
    }
    public static void main(String args[]){
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}   