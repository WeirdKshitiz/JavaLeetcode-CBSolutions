public class sortedArrayToBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node createBST(int arr[],int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr, start, mid-1);
      root.right=createBST(arr, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        //sorted array is given which is equal to inorder
        //so we need to find middle and make it the root;
Node Root=createBST(arr, 0, arr.length-1);
preOrder(Root);
    }
}
