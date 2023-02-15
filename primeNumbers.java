import java.util.*;
public class primeNumbers {
public static void primeFactor(int n){
    int i=2;     
    while(i<=n){
       while(n%i==0){
            System.out.println(i+" ");
            n=n/i;
        }
      i++;   
    }
}
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       primeFactor(n);
    }
}

