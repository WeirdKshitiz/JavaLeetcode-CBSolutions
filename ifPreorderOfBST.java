import java.util.*;
public class ifPreorderOfBST {
    static int canRepresentBST(int arr[], int N) {
        Stack<Integer> st = new Stack<>();
        int root = Integer.MIN_VALUE;
        for(int i= 0;i<N;i++){
        
         if(root>arr[i]){
             return 0;
         }
         
         while(st.size()>0 && st.peek()<=arr[i]){
             root = st.peek();
             st.pop();
         }
         
         st.push(arr[i]);
        }
        return 1;
     }
    
    public static void main(String[] args) {
        ifPreorderOfBST bst=new ifPreorderOfBST();
        int[] pre=new int[]{40,30,35,80,100};
        int n=pre.length;
       System.out.println(canRepresentBST(pre, n));
    }
}
