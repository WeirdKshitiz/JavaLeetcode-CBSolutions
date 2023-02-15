// import java.util.*;
// public class noob{
//     public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
//         if(idx==str.length()){
//             System.out.println(newStr);
//             return;
//         }

//         char currChar=str.charAt(idx);

//        if(map[currChar-'a']==true){
//         removeDuplicates(str, idx+1, newStr, map);
//        }
//        else{
//         map[currChar-'a']=true;
//         removeDuplicates(str, idx+1, newStr.append(currChar), map);
//        }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.next();
//         removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
//     }
// }



// import java.util.*;
// public class pairSum1 {

//     public static boolean pairSum1(ArrayList<Integer> list,int target){
//         int lp=0;
//         int rp=list.size()-1;

//         while(lp!=rp){
//             //case1
//             if(list.get(lp)+list.get(rp)==target){
//                 return true;
//             }
//             //case 2
//             if(list.get(lp)+list.get(rp)<target){
//                 lp++;
//             }
//             else{
//                 rp--;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();

//        list.add(1);
//        list.add(8);
//         list.add(6);
//         list.add(2);
//        list.add(5);
//        list.add(4);
//       list.add(8);
//         list.add(3);
//       list.add(7);
// int target=50;
// System.out.println(pairSum1(list,target));
//     }
// }


//first and last occurenece
// import java.util.*;
// public class noob {

//     public static int findFirstOccurence(int nums[],int target){
//         int left=0;
//         int right=nums.length-1;

//         int result=-1;
//         while(left<=right){
//             int mid=(left+right)/2;

//             if(target==nums[mid]){
//                 result=mid;
//                  right=mid-1; //for finding first occurence
//                 left=mid+1; //for finding last occurence
//             }
//             else if(target<nums[mid]){
//                 right=mid-1;
//             }
//             else{
//                 left=mid+1;
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int nums[]={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
//         int target=5;
//         int index=findFirstOccurence(nums,target);
//         if(index!=-1){
//             System.out.println("The first occurrence of element " + target +
//                             " is located at index " + index);
//         }
//         else {
//             System.out.println("Element not found in the array");
//         }
//     }
// }





//aggressive cows
// import java.util.*;
// public class noob{

//     public static boolean isPossible(int a[],int n,int cows,int minDist){
//         int cntCows=1;
//         int lastPlacedCow=a[0];
//         for(int i=1;i<n;i++){
//             if(a[i]-lastPlacedCow>=minDist){
//                 cntCows++;
//                 lastPlacedCow=a[i];
//             }
//         }
//         if(cntCows>cows){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int n=5,cows=3;
//         int a[]={1,2,8,4,9};
// Arrays.sort(a);
        
//         int low=1,high=a[n-1]-a[0];
//         while(low<=high){
//             int mid=(low+high)/2;

//             if(isPossible(a,n,cows,mid)){
//                 low=mid+1;
//             }
//             else{
//                 high=mid-1;
//             }
//         }
//         System.out.println("The largest minimum distance is " + high);
//     }
// }









// public class noob{
//     public static void maxSubarraySum(int numbers[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             for(int j=i;j<numbers.length;j++){
//                 currSum=0;
//                 for(int k=i;k<=j;k++){
//                     currSum+=numbers[i];
//                 }
//                 if(maxSum<currSum){
//                     maxSum=currSum;
//                 }
//             }
//         }
//         System.out.println(maxSum);
//     }
//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10};
//         maxSubarraySum(numbers);
//     }
// }



// import java.util.*;
// public class stock {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//         }
//         int ans=0;
//         int minPrice=arr[0];
//         for(int i=0;i<n;i++){
//             minPrice=Math.min(arr[i],minPrice);
//             ans=Math.max(ans,arr[i]-minPrice);
//         }
//         System.out.println(ans);
//     }
// }



// import java.util.*;
// public class pushAtTheBottomOfStack {
//     public static void pushAtTheBottom(Stack<Integer> s,int data){
//         if(s.empty()){
//             s.push(data);
//             return;
//         }
//         int top=s.pop();
//         pushAtTheBottom(s, data);
//         s.push(top);
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s=new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         pushAtTheBottom(s,4);
//         while(!s.empty()){
//             System.out.println(s.pop());
//         }
//     }
  
// }



// import java.util.*;
// public class noob{
//     public static String reverseString(String str){
//         Stack<Character>s=new Stack<>();
//         StringBuilder result=new StringBuilder("");
//         int idx=0;
//         while(idx<str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }
//         while(!s.isEmpty()){
//             char curr=s.pop();
//             result.append(curr);
//         }
//         return result.toString();
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         String result=reverseString(str);
//         System.out.println(result);
//     }
// }





// import java.util.*;
// public class reverseAStack {
//     public static void pushAtTheBottom(Stack<Integer> s,int data){
//         if(s.empty()){
//             s.push(data);
//             return;
//         }
//         int top=s.pop();
//         pushAtTheBottom(s, data);
//         s.push(top);
//     }
//     public static void reverseAStack(Stack<Integer>s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top=s.pop();
//         reverseAStack(s);
//         pushAtTheBottom(s,top);
//     }

//     public static void printStack(Stack<Integer>s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s=new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
// //3,2,1
//        // printStack(s);
//         reverseAStack(s);
//         printStack(s);
//         //1,2,3
//     }
// }









// import java.util.*;

// public class stockSpan {
//     public static void stocksSpan(int stocks[],int span[]){
//         Stack<Integer> s=new Stack<>();
//         span[0]=1;
//         s.push(0);

//         for(int i=1;i<stocks.length;i++){
//             int currPrice=stocks[i];
//             while(!s.isEmpty()&&currPrice>stocks[s.peek()]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 span[i]=i+1;
//             }
//             else{
//                 int prevHigh=s.peek();
//                 span[i]=i-prevHigh;
//             }
//             s.push(i);
//         }
//     }
//     public static void main(String[] args) {
//         int stocks[]={100,80,60,70,60,85,100};
//         int span[]=new int[stocks.length];
//         stocksSpan(stocks,span);
//         for(int i=0;i<span.length;i++){
//             System.out.println(span[i]+" ");
//         }
//     }
// }






// import java.util.*;
// public class nextGreaterElement {
    

//     public static void main(String[] args) {
//         int arr[]={6,8,0,1,3};
//         Stack<Integer>s=new Stack<>();
//         int nextGreater[]=new int[arr.length];

//         for(int i=arr.length-1;i>=0;i--){

// while(!s.empty() && arr[s.peek()]<=arr[i]){
//     s.pop();
// }
// if(s.isEmpty()){
// nextGreater[i]=-1;
// }
// else{
//     nextGreater[i]=arr[s.peek()];
// }

// s.push(i);
//         }
//         for(int i=0;i<nextGreater.length;i++){
//             System.out.println(arr[i]+","+nextGreater[i]);
//         }
//         System.out.println();
//     }
// }









// import java.util.*;
// public class validParenthesis {
//     public static boolean isValid(String str){
//         Stack<Character>s=new Stack<>();

//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);

//             if(ch=='(' || ch=='{' || ch=='['){
//                 s.push(ch);
//             }
//             else{
//                 //closing
//                 if(s.isEmpty()){
//                     return false;
//                 }
//                 if((s.peek()=='(' && ch==')')
//                 || (s.peek()=='{' && ch=='}')
//                 || (s.peek()=='[' && ch==']')){

//                     s.pop();
//                 }
//                 else{
//                     return false;
//                 }
//             }
//         }
//         if(s.isEmpty()){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         String str="({}())[]";
//         System.out.println(isValid(str));
//     }
// }







// import java.util.*;
// public class duplicateParanthesis {
//     public static boolean isDuplicate(String str){
//         Stack<Character> s=new Stack<>();

//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);

//             //closing
//             if(ch==')'){
//                 int count=0;
//                 while(s.peek()!='('){
//                     s.pop();
//                     count++;
//                 }
//                 if(count<1){
//                     return true;
//                 }
//                 else{
//                     s.pop();
//                 }
//             }
//             else{
//                 s.push(ch);
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         String str="((a+b))";
//         System.out.println(isDuplicate(str));
//     }
// }







import java.util.*;
public class noob{
    static class Node{
        int data;
        Node left,right;
        Node(){}
        Node(int data){
this.data=data;
left=right=null;
        }
    }


    private static class pair{
        Node node;
        int col;
        pair(Node root,int col){
            this.node=node;
            this.col=col;
        }
    }


    private static void bottomView(Node root){
        if(root==null) return;
    }
    public static void main(String[] args) {
        
    }
}



