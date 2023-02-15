import java.util.*;
public class fourthnov {

    public static void insertAtBottom(Stack<Integer> st,int x){
if(st.isEmpty()){
    st.push(x);
}
else { 
    int a = st.peek();
     st.pop(); 
     insertAtBottom(st,x); 
     st.push(a);
     }
    }

    public static void reverse(Stack<Integer> st){
        if(st.size()>0){
            int x=st.peek();
            st.pop();
            reverse(st);
            insertAtBottom(st,x);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
    //    System.out.println(st.pop()); 
    reverse(st);
    System.out.println(st);
   
    }

}
