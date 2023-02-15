import java.util.*;
public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        //System.out.println(st);

        Stack<Integer> st1=new Stack<>();
        st1.push(st.pop());
        st1.push(st.pop());
        st1.push(st.pop());

        System.out.println(st1);

        Stack<Integer> st2=new Stack<>();
        st2.push(st1.pop());
        st2.push(st1.pop());
        st2.push(st1.pop());

        System.out.println(st2);


    }
}
