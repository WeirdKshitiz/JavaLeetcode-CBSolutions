import java.util.Scanner;

public class passorfail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
