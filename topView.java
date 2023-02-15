import java.util.*;
public class topView{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    private static class Pair{
        Node node;
        int col;
        Pair(Node root,int col){
            this.node=root;
            this.col=col;
        }
    }
    private static void topView(Node root){
        if(root==null) return;

        LinkedList<Pair>q=new LinkedList<>();
        TreeMap<Integer,Integer>tmap=new TreeMap<>();

        int col=0;
        q.addFirst(new Pair(root,col));
        while(!q.isEmpty()){
        Pair temp=q.removeFirst();

if(!tmap.containsKey(temp.col)){
    tmap.put(temp.col,temp.node.data);
}

if(temp.node.left!=null) q.addLast(new Pair(temp.node.left, temp.col-1));
if(temp.node.right!=null) q.addLast(new Pair(temp.node.right, temp.col+1));
        }
for(int x:tmap.keySet()){
    System.out.println(tmap.get(x)+" ");
}


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Node> q=new LinkedList<>();

        Node root=new Node(sc.nextInt());
        q.addFirst(root);
        while(!q.isEmpty()){
            Node temp=q.removeFirst();

            int x=sc.nextInt();
            if(x!=-1){
                Node temp2=new Node(x);
                q.addLast(temp2);
                temp.left=temp2;
            }
            x=sc.nextInt();
            if(x!=-1){
                Node temp2=new Node(x);
                q.addLast(temp2);
                temp.right=temp2;
            }
        }
        topView(root);
    }
}