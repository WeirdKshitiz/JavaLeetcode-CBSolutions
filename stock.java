import java.util.*;
public class stock {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
    }
    int ans=0;
    int minPrice=arr[0];
    for(int i=0;i<n;i++){
        minPrice=Math.min(arr[i],minPrice);
        ans=Math.max(ans,arr[i]-minPrice);
    }
    System.out.println(ans);
   } 
}




