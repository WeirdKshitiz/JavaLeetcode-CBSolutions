import java.util.*;
public class binarySearch {

    public static int findIt(int arr[],int low,int high,int target){
        int mid=(low+high)/2;
if(arr[mid]==target){
    return mid;
}
if(target<arr[mid]){
   return findIt(arr, low, mid-1, target);
}
else{
return findIt(arr, mid+1, high, target);
}


    }
    public static void main(String[] args) {
        int arr[]={1,4,2,6,3,5,9,4};
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println( findIt(arr,0,arr.length-1,4));
      
}

}