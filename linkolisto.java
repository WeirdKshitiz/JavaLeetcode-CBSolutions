import java.util.*;
public class linkolisto{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void print() {
        if (head == null) {
            System.out.println("KHALI HAI SAALI LINKED LIST");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }



public void addFirst(int data){
    Node newNode=new Node(data);

    if(head==null){
        head=tail=newNode;
        return;
    }

    newNode.next=head;

    head=newNode;
}


public int removeFirst(){
    if(size==0){
        System.out.println("linked list khali hai");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val=head.data;
        head=tail=null;
        return val;
    }
    int val=head.data;
    head=head.next;
    return val;

}

public static int itrSearch(int key){
    Node temp=head;
    int i=0;
    while(temp!=null){
        if(temp.data==key){
            //agar head pe hi mil gyi value to
            //key found
            return i;
        }
        temp=temp.next;
        i++;

    }
    //key not found
    return -1;
     
}




public int removeLast(){
    if(size==0){
        System.out.println("linked list khali hai");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val=head.data;
        head=tail=null;
        return val;
    }
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }
    int val=prev.next.data;
    prev.next=null;
    tail=prev;
    return val;
}


public Node findMid(Node head){
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}

public void zigzag(){
    Node slow=head;
    Node fast=slow;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;

    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }

    Node left=head;
    Node right=prev;
    Node nextL,nextR;

    while(left!=null && right!=null){
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;

        left=nextL;
        right=nextR;
    }
}













public void addLast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
}

    public static void main(String[] args) {
        linkolisto ll=new linkolisto();
        

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
       ll.addLast(4);
       ll.addLast(5);
        ll.print();
       ll.zigzag();
       ll.print();
 
        //  ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
// System.out.println(itrSearch(1));
        
//ll.recSearch(2);



 
    }
}