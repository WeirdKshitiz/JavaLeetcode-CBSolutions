import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;
public class maxKelements {
    public static long maxKpelements(int[] arr,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        long sum=0;
        while(k!=0){
            int p=pq.remove();
            sum+=p;
            int ans=(int)Math.ceil(p/3.0);

            pq.add(ans);
            k--;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,10,3,3,3};
        int k=3;
       System.out.println(maxKpelements(arr,k)); 
    }
}
