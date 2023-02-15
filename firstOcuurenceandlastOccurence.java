import java.util.*;
public class firstOcuurenceandlastOccurence {

    public static int findFirstOccurence(int nums[],int target){
        int left=0;
        int right=nums.length-1;

        int result=-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(target==nums[mid]){
                result=mid;
                 right=mid-1; //for finding first occurence
                left=mid+1; //for finding last occurence
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        } 
        return result;
    }

    public static void main(String[] args) {
        int nums[]={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target=5;
        int index=findFirstOccurence(nums,target);
        if(index!=-1){
            System.out.println("The first occurrence of element " + target +
                            " is located at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
}


