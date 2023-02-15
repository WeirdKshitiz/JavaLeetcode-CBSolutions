import java.util.*;

public class binaryToDecimal {

    public static void binaryToDecimal(int a){
        int decNum=0,pow=0;
        while(a>0){
             int lastDigit=a%10;
             decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
             pow++;
             a/=10;
        }
        System.out.println("decimal of binary number is :"+decNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        binaryToDecimal(a);
    }
}
