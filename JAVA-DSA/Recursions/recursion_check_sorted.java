public class recursion_check_sorted {
    // time complexity =O(n)
    public static boolean isSortedType1(int arr[],  int indx){
         if(indx==arr.length-1){
            return true;
        }
        if(arr[indx]<arr[indx+1]){
            //array is sorted till now
            return isSortedType1(arr, indx+1);
        }
        else{
            return false;
        }
    }
    //or
    public static boolean isSortedType2(int arr[],  int indx){
        if(indx==arr.length-1){
            return true;
        }
        if(arr[indx]>=arr[indx+1]){
            //array is sorted till now
            return false;
        }
        return isSortedType2(arr, indx+1);
    }
    public static void main(String args[]){
        int arr[]={6,3,5};
        System.out.println(isSortedType2(arr,0));
    }
}