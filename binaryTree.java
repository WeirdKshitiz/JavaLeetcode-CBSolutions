import java.util.Scanner;

public class binaryTree {
    public class Node{
        int data;
        Node left;
        Node right;
    }
    Scanner sc=new Scanner(System.in);
    Node root;
    binaryTree(){

    }
    public void createTree(){
int x=sc.nextInt();
Node n=new Node();
n.data=x;

if(sc.nextBoolean()){
    n.left=createTree();
}
if(sc.nextBoolean()){
    n.right=createTree();
}
return n;
    }
    public static void main(String[] args) {
        
    }
}
