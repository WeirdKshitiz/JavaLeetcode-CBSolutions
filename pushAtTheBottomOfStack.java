import java.util.*;
public class pushAtTheBottomOfStack {
    public static void pushAtTheBottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtTheBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtTheBottom(s,4);
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
  
}
