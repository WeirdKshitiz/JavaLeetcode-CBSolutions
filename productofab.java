import java.util.*;
public class productofab {
    public static int getProduct(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=getProduct(a,b);
        System.out.println("product is "+product);
    }
}
