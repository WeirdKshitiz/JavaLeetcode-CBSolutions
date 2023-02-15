import java.util.*;
public class hashSetIteration {
    public static void main(String[] args) {
        HashSet<String>cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
System.out.println(cities);
        // Iterator it=cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


        // for(String city:cities){
        //     System.out.println(city);
        // }


LinkedHashSet<String>citios=new LinkedHashSet<>();
citios.add("Delhi");
citios.add("Mumbai");
citios.add("Noida");
citios.add("Bengaluru");
System.out.println(citios);


    }
}
