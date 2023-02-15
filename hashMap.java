// import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        //country is key of type string
        //population is value of type int
        HashMap<String,Integer>map=new HashMap<>();
        
        
        //insertion 
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        int population=map.get("India");
        System.out.println(population);

        map.put("China", 122);
        //if we insert duplicate value it will update the value


        //search/lookup operation
        // if(map.containsKey("China")){
        //     System.out.println("key is present in the map");
        // }
        // else{
        //     System.out.println("key is not present in them map");
        // }


        // System.out.println(map.get("China"));
        // System.out.println(map.get("Indonesia"));

//regular way
        // int arr[]={12,15,18};
        // for(int i=0;i<3;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println();

        // //hashing iterator way 
        // for(int val:arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        //MAP ENTRY=IMP
for(Map.Entry<String,Integer>e:map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
}

//another way to print keys only
// Set<String>keys=map.keySet();
// for(String key:keys){
//     System.out.println(key+" "+map.get(key));
// }


//remove
map.remove("China");//it will remove key as well as value


    }
}
