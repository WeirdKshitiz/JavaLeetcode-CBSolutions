import java.util.*;


public class HashMapCode {
    static class HashMap<K,V>{
        private class Node{
        K key;
        V value;

        public Node(K key,V value){
            this.key=key;
            this.value=value;
        }
    }
    private int n;//n=tot no of nodes
    private int N;//N=buckets
    private LinkedList<Node> buckets[]; //N =buckets.length
    //bucket hi hashmap hai

    @SuppressWarnings("unchecked")
public HashMap(){
    this.N=4;
    this.buckets=new LinkedList[4];
    for(int i=0;i<4;i++){
        this.buckets[i]=new LinkedList<>(); //new linked list likh rhe hain har bucket index ke liye
    }
}

private int hashFunction(K key){
    //bi(bucket index)ki value sirf 0 to n-1 hi honi chahiye
int bi=key.hashCode();
//math.abs=mod deta hai=mtlb jo bhi -ve values hongi vo +ve hoke milengi
return Math.abs(bi)%N;
}

@SuppressWarnings("unchecked")
private void rehash(){
    LinkedList<Node>oldBucket[]=buckets;
    buckets=new LinkedList[N*2];

    for(int i=0;i<N*2;i++){
        buckets[i]=new LinkedList<>();
    }

    //nodes->add in bucket
    for(int i=0;i<oldBucket.length;i++){
        LinkedList<Node>ll=oldBucket[i];
        for(int j=0;j<ll.size();j++){
            Node node=ll.get(j);
            put(node.key, node.value);
        }
    }
}



private int searchInLL(K key,int bi){
    LinkedList<Node>ll=buckets[bi];
    int di=0;
    for(int i=0;i<ll.size();i++){
        if(ll.get(i).key==key){
            return i; //it is data index(di)
        }
    }
return -1;
}


public void put(K key,V value){
    int bi=hashFunction(key);//bi=bucket index
    //ye key ko leta hai aur bucket index ko vapis de deta hai

    int di=searchInLL(key,bi);//return data index
    //if di =-1 then key pehle se exist nhi krti

    if(di==-1){
        //key doesn't exist
        buckets[bi].add(new Node(key, value));
        n++;
    }
    else{
        //key exists
       Node data= buckets[bi].get(di);
       data.value=value;
    }

    double lamda=(double)n/N;
    if(lamda>2.0){
       // k=2.0
     //  if lamda>k then do rehashing

        //rehashing
        rehash();

    }
}

public boolean containsKey(K key){
    int bi=hashFunction(key);
    int di=searchInLL(key, bi);

    if(di==-1){
        return false;
    }
    else{
      return true;
    }  
}



public V remove(K key){
    int bi=hashFunction(key);
    int di=searchInLL(key, bi);

    if(di==-1){
        return null;
    }
    else{
        Node node=buckets[bi].remove(di);
        n--;
        return node.value;
    }
}

public V get(K key){
    int bi=hashFunction(key);
    int di=searchInLL(key, bi);

    if(di==-1){
        return null;
    }
    else{
        Node node=buckets[bi].get(di);
        return node.value;
    }
}

public ArrayList<K> keySet(){
    ArrayList<K> keys=new ArrayList<>();
    
    for(int i=0;i<buckets.length;i++){ //bi
        LinkedList<Node> ll=buckets[i];
        for(int j=0;j<ll.size();j++){ //di
            Node node=ll.get(j);
            keys.add(node.key);
        }
    }
    return keys;
}

public boolean isEmpty(){
    return n==0;
}


    }
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("China", 200);
        map.put("India", 120);
        map.put("US", 520);

      ArrayList<String>keys=map.keySet(); //ye humein saari keys laake dedega
      for(int i=0;i<keys.size();i++){
System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
      }
      map.remove("India");
    System.out.println(map.get("India"));
    }
}


//WHAT IS GOING ON?
//HUMESHA KEY KO PASS KRKE HUM APNA NUCKET INDEX NIKAAL SKTE HAIN
//AB HUM EK EK LINKED LIST PE JAAKE CHECK KRENGE KI HMARI KEY EXIST KRTI HAI YA NHI!
//AGAR KRTI HAI TO USKE LIYE DATA INDEX DEDO
//AGAR DATA INDEX VALID HAI ,ISKA MATLAB HAI KEY EXIST KRTI HAI,AUR AGAR -1 HAI TO KEY EXIST NHI KRTI
//AGAR VALID HAI TO USE UPDATE KRDO
//AUR AGAR -1 HAI TO NYE NODE KO ADD KRNA PDEGA

