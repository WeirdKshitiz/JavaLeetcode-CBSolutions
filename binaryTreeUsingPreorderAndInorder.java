import java.util.*;
class Node{
    char data;
    Node left,right;
    Node(char item){
        data=item;
        left=right=null;
    }
}
public class binaryTreeUsingPreorderAndInorder {
    Node root;
    static int preIndex=0;

   public Node buildTree(char in[],char pre[],int inStart,int inEnd){

    if(inStart>inEnd){
        return null;
    }

    Node tNode=new Node(pre[preIndex++]);

    if(inStart==inEnd){
        return tNode;
    }

    int inIndex=search(in,inStart,inEnd,tNode.data);

    tNode.left=buildTree(in, pre, inStart, inIndex-1);
    tNode.right=buildTree(in, pre, inIndex+1, inEnd);

    return tNode;
    
   }

   int search(char arr[], int strt, int end, char value)
   {
       int i;
       for (i = strt; i <= end; i++) {
           if (arr[i] == value)
               return i;
       }
       return i;
   }

   /* This function is here just to test buildTree() */
   void printInorder(Node node)
   {
       if (node == null)
           return;

       /* first recur on left child */
       printInorder(node.left);

       /* then print the data of node */
       System.out.print(node.data + " ");

       /* now recur on right child */
       printInorder(node.right);
   }
    public static void main(String[] args) {
        binaryTreeUsingPreorderAndInorder tree=new binaryTreeUsingPreorderAndInorder();

        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
        int len = in.length;
        Node root = tree.buildTree(in, pre, 0, len - 1);
 
        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(root);
    }
}
