import java.util.Scanner;

import java.util.*;
public class findxforn {

    public static int search(int n){
        int low=1;
        int high=n-1;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        // x raise to power 2 <=N;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int z=search(n);
        System.out.println(z);
    }
}
