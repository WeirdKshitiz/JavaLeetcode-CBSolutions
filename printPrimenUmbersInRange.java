import java.util.*;
public class printPrimenUmbersInRange {
    public static boolean checkprime(int n){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;
    }
    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(checkprime(i)){
                System.out.println(i);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //n value tak check krenge, 2 se n tak
        primesInRange(n);
    }
}
