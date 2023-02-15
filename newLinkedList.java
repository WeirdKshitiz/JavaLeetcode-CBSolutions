import java.util.LinkedList;

public class newLinkedList {
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


public void print(){

    if(head==null){
        System.out.println("linked list is empty");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}

public int removeFirst(){
    if(size==0){
        System.out.println("LL IS EMPTY");
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

public void add(int idx,int data){
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
    newNode.next=temp.next;
    temp.next=newNode;
}






public void addFirst(int data){
     //step1=create new node
     Node newNode=new Node(data);
size++;
    if(head==null){
head=tail=newNode;
return;
    }
    //step2
    //newNode ka  next=head;
    newNode.next=head; //link

//step3 head=newnode
head=newNode;


}

public int helper(Node head,int key){
    if(head==null){
        return -1;
    }

    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next, key);
    if(idx==-1){
        return -1;
    }
    else{
        return idx+1;
    }
}


public int recSearch(int key){
    return helper(head,key);
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

private Node findMid(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next==null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow; //midnode
}


public boolean checkPalindrome(){
    if(head==null|| head.next!=null){
return true;
    }

    Node midNode=findMid(head);

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

while(right!=null){
    if(left.data!=right.data){
        return false;
    }
    left=left.next;
    right=right.next;
}
return true;
}

public void deleteNthfromEnd(int n){
    int size=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        size++;
    }
    if(n==size){
        head=head.next;
        return;
    }
    int i=1;
    int iToFind=size-n;
    Node prev=head;
    while(i<iToFind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
}

public static boolean isCycle(){
    Node slow=head;
    Node fast=head;
    while(fast!=null & fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true; //cycle exists
        }
    }
    return false; //cycle doesn't exist
}

public static void removecycle(){
    //detect cycle
Node slow =head;
Node fast=head;
boolean cycles=false; //no cycle
while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    if(fast==slow){
cycles=true;
break;
    }
}

if(cycles=false){
    return;
}


 //find meeeting point
slow=head;
Node prev=null;
while(slow!=fast){
    prev=fast;
    slow=slow.next;
    fast=fast.next;
}


    //remove cycle (last.next=null)
prev.next=null;
}
private Node merge(Node head1,Node head2){
    Node mergeLL=new Node(-1);
    Node temp=mergeLL;

    while(head1.data<=head2.data){
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

private Node getMid(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next==null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow; //midnode
}
public Node mergeSort(Node head){
    if(head==null||head.next==null){
        return head;
    }
    Node mid=getMid(head);
    Node rightHead=mid.next;
    mid.next=null;
    Node newLeft=mergeSort(head);
    Node newRight=mergeSort(rightHead);

    return merge(newLeft,newRight);
}

public static void main(String[] args) {
   newLinkedList ll=new newLinkedList();
    ll.print();
    // ll.addFirst(2);
    // ll.addFirst(5);
    // ll.addFirst(3);
    // ll.addFirst(1);
    // ll.addFirst(8);
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
   ll.print();

   ll.head=ll.mergeSort(ll.head);
   ll.print();
//   ll.add(2,6);
// ll.print();
// ll.removeFirst();
// ll.print();
// ll.removeLast();
// ll.print();
//System.out.println(ll.size);
// System.out.println( ll.recSearch(3));

// System.out.println( ll.recSearch(8));

// ll.reverse();
// ll.print();

//ll.deleteNthfromEnd(3);
//ll.print();
//System.out.println(ll.checkPalindrome());

// head=new Node(1);
// Node temp=new Node(2);
// head.next=temp;
// head.next.next=new Node(3);
// head.next.next.next=temp;
// System.out.println(isCycle());
// removecycle();
// System.out.println(isCycle());
}
}
 