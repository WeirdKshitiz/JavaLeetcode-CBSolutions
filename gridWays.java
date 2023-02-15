public class gridWays {
    public static int gridWayss(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            //matlab ek rasta hai
            return 1;
        }

       else if(i==n || j==m){
            //boundrary cross hogyi,so no rasta
            return 0;
        }

        int way1=gridWayss(i+1, j, n, m);
        int way2=gridWayss(i, j+1, n, m);
 
        return way1+way2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridWayss(0,0,n,m));
    }
}
