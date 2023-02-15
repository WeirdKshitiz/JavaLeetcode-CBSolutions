import java.util.*;
public class arrayListQuestions {
    public static boolean monotonicArray(ArrayList<Integer> list,int n){
boolean inc=true;
boolean dec=true;
for(int i=0;i<n;i++){
    if(list.get(i)>list.get(i+1)){
        inc=false;
    }
    if(list.get(i)<list.get(i+1)){
        dec=false;
    }
   
}
   
return inc||dec;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        int n=list.size();
//        if(monotonicArray(list,n)){
// System.out.println(true);
//        }
//        else{
//         System.out.println("false");
//        }
System.out.println(monotonicArray(list, n));
    }
}
