import java.util.ArrayList;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
public class arrayList {

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();

// list.add(1);
// list.add(2);
// list.add(3);
// list.add(4);


//System.out.println(list);

// int ele=list.get(2);
// System.out.println(ele); 


// list.remove(2);
// System.out.println(list);
 

// list.set(1,10);
// System.out.println(list);

// System.out.println(list.contains(1));

// System.out.println(list.size());

// //print the array list
// for(int i=0;i<list.size();i++){
//     System.out.print(list.get(i)+" ");
// }
// System.out.println();



//reverse of an arraylist

// for(int i=list.size()-1;i>=0;i--){
//     System.out.print(list.get(i)+" ");
// }

//find max in array list

// int max=Integer.MIN_VALUE;
// for(int i=0;i<list.size();i++){
//     if(list.get(i)>max){
//         max=list.get(i);
//     }
// }
// System.out.print(max);




//SWAP 2 NUMBERS
// System.out.print(list);
// int idx1=1,idx2=3;
// swap(list,idx1,idx2);
// System.out.println();

// System.out.print(list);





list.add(2);
list.add(5);
list.add(9);
list.add(4);
list.add(6);
System.out.println(list);

Collections.sort(list);


System.out.println(list);


Collections.sort(list,Collections.reverseOrder());


System.out.println(list);

    }
}
 