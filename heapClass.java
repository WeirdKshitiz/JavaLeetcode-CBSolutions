import java.util.ArrayList;

public class heapClass {
    static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();

        public void add(int data){
            //add at last index
            arr.add(data);
            int x=arr.size()-1; //child index
            int parent=(x-1)/2;

            while(arr.get(x)<arr.get(parent)){
                //swap
                int temp=arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent, temp);


                x=parent;
                parent=(x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);

    
        }

        private void heapify(int idx){
            int left=2*idx+1;
            int right=2*idx+2;
            int minIdx=idx;

            //left<arr.size() to check if we are not finding left index of leaf node
            if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
                minIdx=left;
            }
             //right<arr.size() to check if we are not finding right index of leaf node
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
                minIdx=right;
            }

            if(minIdx!=idx){

//agar delete krne ke baad parent minIndex nhi hai
//then swap

int temp=arr.get(idx);
arr.set(idx,arr.get(minIdx));
arr.set(minIdx,temp);

//jis index pe maine value ko change kiya ,use pe ye call jaayega ,to check agar kahin bhi 
//to nhi bigda hai heap
heapify(minIdx);
            }

        }

        public int remove(){
            int data=arr.get(0);

            //step1=swap first index and last index
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2=delete last 
            arr.remove(arr.size()-1);

            //step3=heapify
            heapify(0);
            return data;

        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
public static void main(String[] args) {
    Heap h=new Heap();
    h.add(3);
    h.add(4);
    h.add(1);
    h.add(5);

    while(!h.isEmpty()){
        System.out.println(h.peek());
        h.remove();
    }
}
}
