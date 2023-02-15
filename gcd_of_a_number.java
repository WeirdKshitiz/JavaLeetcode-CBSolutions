import java.util.*;
public class gcd_of_a_number {
    public static void gcdIt(int n,int m){
        int rem=m%n;
        if(m%n==0){
            System.out.println(n+" ");
        }
        else{
            gcdIt(rem, n);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
       gcdIt(n,m);

    }
}
