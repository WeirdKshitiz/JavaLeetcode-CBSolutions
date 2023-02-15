import java.util.Arrays;

public class bubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                   int temp=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,2,4,9,8};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
