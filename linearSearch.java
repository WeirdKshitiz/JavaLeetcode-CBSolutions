public class linearSearch {
    public static void search(int arr[],int ele,int n){
for(int i=0;i<n;i++){
    if(arr[i]==ele){
        System.out.println("ele found at index "+i);
    }

}
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        int n=8;
        int ele=5;
        search(arr,ele,n);
    }
}
