import java.util.*;
public class decimalToBinary {
public static void DecimaltoBinary(int a){
    int binaryNumber=0,pow=0;

    while(a>0){
        int rem=a%2;
        binaryNumber=binaryNumber+(rem*(int)Math.pow(10,pow));
        pow++;
        a/=2;
    }
    System.out.println("decimal to binary is "+binaryNumber);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        DecimaltoBinary(a);
    }
}
