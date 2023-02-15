import java.util.Scanner;

public class binomialCoefficient {
    public static int getFactorial(int a){
        if(a==0){
            return 1;
        }
        return a*getFactorial(a-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int factorial=getFactorial(a)/getFactorial(b)*getFactorial(a-b);
        System.out.println("factorial of "+a+" is "+factorial);
    }
}
