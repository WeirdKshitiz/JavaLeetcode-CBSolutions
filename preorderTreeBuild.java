import java.lang.System.Logger.Level;
import java.util.*;

public class preorderTreeBuild {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {

            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        public static int count(Node root) {
            if (root == null) {
                return 0;
            }
            int leftCount = count(root.left);
            int rightCount = count(root.right);

            return leftCount + rightCount + 1;
        }

        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            return leftSum + rightSum + root.data;
        }

     

        

        public static int diameter2(Node root) {
            if (root == null) {
                return 0;
            }

            int leftDiam = diameter2(root.left);
            int leftHt = height(root.left);
            int rightDiam = diameter2(root.right);
            int rightHt = height(root.right);

            int selfDiam = leftHt + rightHt + 1;
            return Math.max(selfDiam, Math.max(leftDiam, rightDiam));

        }

        public static class Info {
            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static Info diameter(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }

            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(diam, ht);
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;

    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        boolean leftAns = isSubtree(root.left, subRoot);
        boolean rightAns = isSubtree(root.right, subRoot);

        return leftAns || rightAns;
    }

    static class Infoo {
        Node node;
        int horizontalDistance;

        public Infoo(Node node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }

    public static void topView(Node root) {
        // level order
        Queue<Infoo> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Infoo(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Infoo curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                if (!map.containsKey(curr.horizontalDistance)) {
                    // first time my horizontal distance is occuring
                    map.put(curr.horizontalDistance, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Infoo(curr.node.left, curr.horizontalDistance - 1));
                    min = Math.min(min, curr.horizontalDistance - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Infoo(curr.node.right, curr.horizontalDistance + 1));
                    max = Math.max(max, curr.horizontalDistance + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }

    }

    public static void kLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kLevel(root.left, level + 1, k);
        kLevel(root.right, level + 1, k);
    }

public static boolean getPath(Node root,int n,ArrayList<Node> path){

    if(root==null){
        return false;
    }
    path.add(root);
    if(root.data==n){
        return true;
    }
   boolean foundLeft= getPath(root.left, n, path);
   boolean foundRight= getPath(root.right, n, path);

   if(foundLeft||foundRight){
    return true;
   }
   path.remove(path.size()-1);
   return false;
}


    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        //last common ancestor
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
if(path1.get(i)!=path2.get(i)){
    break;
}
        }
        //last equal node 
        Node lca=path1.get(i-1);
        return lca;
    }




    public static Node lca2(Node root,int n1,int n2){
      
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }

       Node leftLca= lca2(root.left, n1, n2);
       Node rightLca= lca2(root.right, n1, n2);

       //leftLca=valid but rightLca=null
       if(rightLca==null){
        return leftLca;
       }

       if(leftLca==null){
        return rightLca;
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
        Node lca=lca2(root, n1, n2);
int dist1=lcaDist(lca,n1);
int dist2=lcaDist(lca,n2);

return dist1+dist2;
    }



    public static int KAncestor(Node root,int n,int k){

        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }

        int leftDist=KAncestor(root.left, n, k);
        int rightDist=KAncestor(root.right, n, k);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        }

        int max=Math.max(leftDist,rightDist);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }


    public static int transform(Node root){
        if(root==null){
            return 0;
        }
       int leftChild=transform(root.left);
     int rightChild=transform(root.right);

        int data=root.data;

        int newLeft=root.left==null?0:root.left.data;
        int newRight=root.right==null?0:root.right.data;



        root.data=newLeft+leftChild+newRight+rightChild;
        return data;
    }

    public static void preordere(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preordere(root.left);
        preordere(root.right);
    }


    public static void main(String[] args) {
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree=new BinaryTree();
        // Node root=tree.buildTree(nodes);
        // System.out.println(root.data);

        // tree.preorder(root);
        // System.out.println();
        // tree.inorder(root);
        // System.out.println();
        // tree.postOrder(root);

        // System.out.println();
        // System.out.println();
        // tree.levelOrder(root);

        // System.out.println("HEIGHT OF THE TREE IS "+tree.height(root));

        // System.out.println("count of tree is "+ tree.count(root));
        // System.out.println("sum of tree is "+ tree.sum(root));
        // System.out.println("diameter of tree is "+ tree.diameter2(root));
        // System.out.println("diameter of tree in linear time complexity o(n) is "+
        // tree.diameter(root).diam);

        // //subtree
        // Node subRoot=new Node(2);
        // subRoot.left=new Node(4);
        // subRoot.right=new Node(5);

        // System.out.println(isSubtree(root,subRoot));

        // topView(root);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7

        // int k=2;
        // kLevel(root,1,k);

//         int n1 = 4, n2 = 6;
//         // System.out.println(lca(root, n1, n2).data);
//         // System.out.println(lca2(root, n1, n2).data); //better time complexity
// System.out.println(minDist(root, n1, n2));


int n=5,k=2;
KAncestor(root, n, k);





transform(root);
preordere(root);

    }
}
