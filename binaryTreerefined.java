import java.util.*;
public class binaryTreerefined {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int arr[]){
            idx++;
            if(arr[idx]==-1){
                return null;
            }
            Node newNode=new Node(arr[idx]);
            newNode.left=buildTree(arr);
            newNode.right=buildTree(arr);
            return newNode;
        }
        public static void preOrder(Node root){
            if(root==null){
               //System.out.println("-1");
                return;
            }
           System.out.println(root.data+" ");
           preOrder(root.left);
           preOrder(root.right);
        }
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
System.out.println();
if(q.isEmpty()){
    break;
}
else{
    q.add(null);
}
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }


    public static int height(Node root){
if(root==null){
    return 0;
}
int lh=height(root.left);
int rh=height(root.right);
return Math.max(lh,rh)+1;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDiameter=diameter(root.left);
        int leftHt=height(root.left);
        int rightDiameter=diameter(root.right);
        int rightHt=height(root.right);

        int selfDiam=leftHt+rightHt+1;
       return Math.max(selfDiam,Math.max(leftDiameter, rightDiameter));
    }

    static class Info{
       Node node;
       int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    public static void topView(Node root){
        //level order
        Queue<Info>q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();

        int min=0,max=0;
        q.add(new Info(root, 0));
        q.add(null); //null show krta hai ki hamra ek level kaha pe khatam hogya hai

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            if(!map.containsKey(curr.hd)) {
                //true=if key is contained in the map
            //else false
    
    map.put(curr.hd, curr.node);
        }
    
        if(curr.node.left!=null){
            q.add(new Info(curr.node.left, curr.hd-1));
            min=Math.min(min,curr.hd-1);
        }
    
        if(curr.node.right!=null){
    q.add(new Info(curr.node.right, curr.hd+1));
    max=Math.max(max, curr.hd+1);
        }
    
        }
     
}

for(int i=min;i<=max;i++){
    System.out.print(map.get(i).data+" "); //i is key
}
System.out.println();
    }

    public static void Klevel(Node root,int level,int K){
        if(root==null){
            return;
        }

        if(level==K){
            System.out.println(root.data+" ");
            return;
        }

Klevel(root.left, level+1, K);
Klevel(root.right, level+1, K);
    }

    public static Node lca(Node root,int n1,int n2){
        if(root==null){
            return root;
        }

        if(root.data==n1||root.data==n2){
            return root;
        }
        Node leftLca=lca(root.left,n1,n2);
        Node rightLca=lca(root.right,n1,n2);

        if(leftLca==null){
            return rightLca;
        }
        if(rightLca==null){
            return leftLca;
        }
        return root;
    }

    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=lcaDist(root.left, n);
        int rightDist=lcaDist(root.right, n);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        else if(leftDist==-1){
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }
    }

   public static int minDist(Node root,int n1,int n2){
    Node lca=lca(root, n1, n2);
    int dist1=lcaDist(lca,n1);
    int dist2=lcaDist(lca,n2);

    return dist1+dist2;
   }

   public static int kAncestor(Node root,int n,int k){

    if(root==null){
        return -1;
    }

    if(root.data==n){
        return 0;
    }
 
    int leftDist=kAncestor(root.left, n, k);
    int rightDist=kAncestor(root.right, n, k);

    if(leftDist==-1 && rightDist==-1){
        return -1;
    }

    int max=Math.max(leftDist,rightDist);
if(max+1==k){
    System.out.println(root.data);
}

return max+1;
   }


   public static int transformToSumTree(Node root){

    if(root==null){
        return 0;
    }

    int leftChild=transformToSumTree(root.left);
    int rightChild=transformToSumTree(root.right);

    int data=root.data;

    int newLeft=root.left==null?0:root.left.data;

    int newRight=root.right==null?0:root.right.data;

    root.data=newLeft+leftChild+newRight+rightChild;
    return data;

   }

   public static void proorder(Node root){
    if(root==null){
return;
    }
    System.out.print(root.data+" ");
    proorder(root.left);
    proorder(root.right);
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }


       // int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(arr);
        //System.out.println(root.data);
       // tree.preOrder(root);
        levelOrder(root);

        //  System.out.println(height(root));
        //  System.out.println(diameter(root));

        topView(root);

        // int k=2;
        // Klevel(root, 1, k);


    //     int n1=4,n2=6;
    //   System.out.println(lca(root,n1,n2).data);


    // int n1=4,n2=6;
    // System.out.println(minDist(root, n1, n2));


//     int n=5,k=2;
//   kAncestor(root, n, k);

// transformToSumTree(root);
// proorder(root);
    }
}
