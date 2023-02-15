import java.util.*;
public class reverseAStack {
    public static void pushAtTheBottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtTheBottom(s, data);
        s.push(top);
    }
    public static void reverseAStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseAStack(s);
        pushAtTheBottom(s,top);
    }

    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
//3,2,1
       // printStack(s);
        reverseAStack(s);
        printStack(s);
        //1,2,3
    }
}
