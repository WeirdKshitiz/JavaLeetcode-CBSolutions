import java.util.*;
public class isprime {
    // public static boolean checkPrime(int n){
    //     boolean isprime=true;
    //     for(int i=2;i<n-1;i++){
    //         if(n%i==0){
    //             isprime=false;
    //             break;
    //         }
    //     }
    //     return isprime;
    // }


     public static boolean checkPrime(int n){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      System.out.println(checkPrime(n)); 
    }
}
