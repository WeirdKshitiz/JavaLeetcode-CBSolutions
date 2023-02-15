import java.util.*;
public class firstOccurence {
    public static void firstFind(int arr[],int n,int key,int i){
        if(i==n){
            return;
        }
            if(arr[i]==key){
                System.out.println(i);
               return; 
        }
        firstFind(arr, n, key, i+1);
    }


    public static int lastFind(int arr[],int key,int start,int end){
        if(start<end){
            return -1;
        }
        
        if(arr[start]==key){
            System.out.println(start);
          
          //return start;
         // return -1;
        }

        return lastFind(arr, key, start-1, end);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[10];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        //firstFind(arr,n,key,0);
//firstFind(arr,n,key,0);
System.out.println(lastFind(arr,key,n,0)); 
    }
}
