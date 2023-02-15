import java.util.*;

public class functionOverloading {
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int smallsum=sum(a,b);
        int smallsum1=sum(a,b,c);

        System.out.println("sum of a and b only is "+smallsum);
        System.out.println("sum of a and b and c is "+smallsum1);
    }
}
