import java.util.*;
public class sumoffirstnumbers {

    public static int Calsum(int n){
        if(n==1){
            return 1;
        }
        int sum1=Calsum(n-1);
        int sum=n+sum1;
        return sum;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
       System.out.println(Calsum(n)); 
        
    }
}
