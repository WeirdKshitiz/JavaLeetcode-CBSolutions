import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);
        System.out.println(set.size());
        set.remove(2);
        if(set.contains(2)){
            System.out.println("set contains");
        }
        else{
            System.out.println("paagal hai kya!");
        }
set.clear();
System.out.println(set.size());
       



    }
}
