import java.util.Arrays;

public class findTheCorrectIndex {
    public static int index(int arr[],int low,int high){
        int x=arr[high];
        int ans=low;
        for(int i=low;i<high;i++){
            if(arr[i]<x){
                int temp=arr[i];
                arr[i]=arr[ans];
                arr[ans]=temp;
                ans++;
            }
        }
        int temp=arr[ans];
        arr[ans]=arr[high];
        arr[high]=temp;
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={5,9,1,3,4};
        int k=index(arr,0,arr.length-1);
       System.out.println(k);
       System.out.println(Arrays.toString(arr));
    }
}
