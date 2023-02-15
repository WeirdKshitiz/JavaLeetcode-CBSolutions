import java.util.*;
public class practice {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt(),k=sc.nextInt();

        PriorityQueue<Integer> minH=new PriorityQueue<>();

        while(n-->0){
            int temp=sc.nextInt();
//System.out.println(minH);
            if(minH.size()<k){
                minH.add(temp);
            }
            else{
                if(temp>minH.peek()){
                    minH.remove();
                    minH.add(temp);
                }
            }
        }/p/CnpOuVxOKgX/
        System.out.println(minH.peek());
    }
}