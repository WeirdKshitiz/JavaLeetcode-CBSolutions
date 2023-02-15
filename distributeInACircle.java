import java.util.*;
public class distributeInACircle {
  public static int distributeInACircle(int n,int size,int position){
    int ans=position+n-1;
        if(ans==0){
          return size;
        }
        return ans;
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=sc.nextInt();
        int position=sc.nextInt();
        System.out.print("ANSWER IS: ");
     System.out.print(distributeInACircle(n,size,position)); 
    }
}
