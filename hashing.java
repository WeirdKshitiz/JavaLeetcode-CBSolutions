import java.util.HashSet;
import java.util.Iterator;
public class hashing {
    public static void main(String[] args) {
        //creating
        HashSet<Integer>set=new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//ismein sirf ek baar hi 1 store hoga as hashset
        //sirf unique elements ko hi store krta hai


        //Search=contains
     
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
if(!set.contains(6)){
    System.out.println("does not contain 6");
}


//DELETE 
// set.remove(1);
// if(!set.contains(1)){
//     System.out.println("does not contain 1");
// }




//SIZE
System.out.println("size of the set is "+set.size());


//PRINT ALL ELEMENTS
System.out.println(set);


//ITERATOR
//you need to import iterator otherwise it wont work
Iterator it=set.iterator(); //iska type bhi iterator hi hai
//functions
// 1.//hasNext=returns true or false if the iterator have next value
// 2.//next=returns the next value

while(it.hasNext()){
    System.out.println(it.next());
}



    }
}
