import java.util.*;
public class printntooone {

    public static void decre(int n){
        if(n==0){
            return;
        }
        else{
       System.out.println(n);
       decre(n-1);
        }
    }

    public static void incre(int start,int end){
if(start>end){
    return;
}
else{
    System.out.println(start);
    incre(start+1, end);

}
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      decre(n);
      incre(1,n);
    }
}
