import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque<Integer>deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.print(deque);
        System.out.println();
        deque.addLast(3);
        System.out.print(deque);
        System.out.println();
        deque.removeFirst();
        System.out.print(deque);
        System.out.println();
        deque.removeLast();
        System.out.print(deque);
        System.out.println();
        System.out.println(deque.getFirst());
        
    }
}
