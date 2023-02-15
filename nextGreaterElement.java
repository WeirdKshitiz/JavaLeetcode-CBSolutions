import java.util.*;
public class nextGreaterElement {
    

    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer>s=new Stack<>();
        int nextGreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

while(!s.empty() && arr[s.peek()]<=arr[i]){
    s.pop();
}
if(s.isEmpty()){
nextGreater[i]=-1;
}
else{
    nextGreater[i]=arr[s.peek()];
}

s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.println(arr[i]+","+nextGreater[i]);
        }
        System.out.println();
    }
}
