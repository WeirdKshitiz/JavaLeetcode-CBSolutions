// import java.util.LinkedList;
import java.util.*;
import java.util.concurrent.CyclicBarrier;

public class linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // step1=create new node
        Node newNode = new Node(data);
        size++;
        // IF LINKED LIST IS EMPTY
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2=newnode ke next=head
        newNode.next = head; // link

        // step3=head=newNode
        head = newNode;
    }


    public void addInMiddle(int idx,int data){
        if(idx==0){
addFirst(data);
return;
        }
        Node newNode=new Node(data);
        size++;
       Node temp=head;
       int i=0;

       while(i<idx-1){
        temp=temp.next;
        i++;
       }

       //i=idx-1 ;temp->prev
       newNode.next=temp.next;
       temp.next=newNode;
    }

    public void addLast(int data) {
        // step1=create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;

        tail = newNode;

    }

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

public int removeFirst(){
    if(size==0){
        System.out.println("Linked list is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val; // it will tell which index is removed
}


public int removeLast(){
    if(size==0){
        System.out.println("LL IS EMPTY");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }

    //prev is i=size-2
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }

    int val=prev.next.data; //tail ka data
    prev.next=null;
    tail=prev;
    size--;
    return val;
}

public static void removecycle(){
    Node slow=head;
    Node fast=head;
    boolean isCycle=false;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(fast==slow){
            isCycle=true;
            break;
        }
    }
    if(isCycle!=true){
        return;
    }
    
    slow=head;
    Node prev=null;
    while(slow!=fast){
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }

    //remove cycle
    prev.next=null;

}



public int itrSearch(int key){
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


public int helper(Node head,int key){
    if(head==null){
        return -1;
    }

    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next,key);
    if(idx==-1){
        return -1;
    }

    return idx+1;
}
 

public int recSearch(int key){
    return helper(head, key);
}



public void reverse(){
    Node prev=null;
    Node curr=tail=head;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}



public void deleteNthfromEnd(int n){
    //calculate size
    int size=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        size++;
    }

    //agar mujhe head ko delete krna ho to
    if(n==size){
        head=head.next; //remove first operation
        return;
    }

//size-n
int i=1;
int indexToFind=size-n;
Node prev=head;
while(i<indexToFind){
prev=prev.next;
i++;
}
//connection forming between other nodes to delete that node
prev.next=prev.next.next;
}


//slow fast approach
public Node findMid(Node head){
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
        slow=slow.next; //+1
        fast=fast.next.next; //+2
    }
return slow; //slow is my midNode
}



public  boolean checkPalindrome(){
    if(head==null || head.next==null){
        return true;
    }
    //step1 find mid
Node midNode=findMid(head);

    //step2 reverse 2nd half
Node prev=null;
Node curr=midNode;
Node next;
while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
}



Node right= prev;//right half ka head
Node left=head;
    //step3 check left half and right half

    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;
}








private Node getMid(Node head){
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow; //mid node
}

private Node merge(Node head1,Node head2){
    Node mergeLL=new Node(-1);
    Node temp=mergeLL;

    while(head1!=null && head2!=null){
        if(head1.data<=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
    }

    while(head1!=null){
        temp.next=head1;
            head1=head1.next;
            temp=temp.next;
    }
    while(head2!=null){
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
    }

    return mergeLL.next;
}



public Node mergeSort(Node head){
    if(head==null || head.next==null){
        return head;
    }

    //FIND MID
    Node mid=getMid(head);
    //left and right MS
    Node rightHead=mid.next;
    mid.next=null;
    Node newLeft=mergeSort(head);
    Node newRight=mergeSort(rightHead);


    //merge
return merge(newLeft,newRight);
}






//zigzag
public void zigZag(){
    //find mid
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;

    //reverse 2nd half
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


    //alt merge - zig zag merge

    while(left!=null && right!=null){
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;

        left=nextL;
        right=nextR;

    }
}

    public static void main(String[] args) {
        linkedList ll = new linkedList();
//         ll.print();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(3);
        // ll.addLast(4);
        

// ll.addFirst(1);
// ll.addLast(1);
// ll.addLast(2);
// ll.addFirst(2);


// ll.print();


        // ll.addInMiddle(2, 9);
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();


        // // ll.removeLast();
        // // ll.print();
        // // System.out.println(ll.size);


        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));


        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));


        // ll.reverse();
        // ll.print(); 

        // ll.deleteNthfromEnd(3);
        // ll.print();
        // System.out.println(ll.checkPalindrome());







        //detect a cycle/loop code
        // head=new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3);
        // head.next.next.next=temp;

        // System.out.println(isCycle());

        // removecycle();
        // System.out.println(isCycle());
        ///1->2->3->4->5-




        //merge sort =time complexity =(O(N LOGN))
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addFirst(3);
       ll.addFirst(4);
       ll.addFirst(5);

      ll.print();
     ll.head= ll.mergeSort(ll.head);
     ll.print();





    //zigzag

    // ll.addLast(1);
    // ll.addLast(2);
    // ll.addLast(3);
    // ll.addLast(4);
    // ll.addLast(5);

    // ll.print();
    // ll.zigZag();
    // ll.print(); 


   

    }
}
