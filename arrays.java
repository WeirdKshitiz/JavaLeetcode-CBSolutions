import java.util.*;
public class arrays {
    public static void main(String[] args) {
        
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt(); //physics
        marks[1]=sc.nextInt(); //chemistry
        marks[2]=sc.nextInt(); //maths


        System.out.println("physics: "+marks[0]);
        System.out.println("chemistry: "+marks[1]);
        System.out.println("maths: "+marks[2]);

        //marks[2]=100;
        marks[2]=marks[2]+1; 
        System.out.println("maths: "+marks[2]);

        int percentage=(marks[0]+marks[1]+marks[2]);
        System.out.println("percentage: "+percentage+" %");
    }
}




























