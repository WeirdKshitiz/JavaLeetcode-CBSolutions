import java.util.*;
public class product {
    public static int findProduct(int n){
if(n==0){
    return 0;
}
int ans=1;
        for(int i=1;i<n;i++){
            ans=n*findProduct(n-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(  findProduct(n));
      
    }
}
