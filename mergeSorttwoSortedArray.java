public class mergeSorttwoSortedArray {

    public static void mergesorted(int[] arr1, int[] arr2, int n,int m, int[] arr3){
        int i=0,j=0, k=0;
        while(i<n && j<m){
                if(arr1[i]<arr2[j]){
                    arr3[k++]=arr1[i++];
                }
                else{
                    arr3[k++]=arr2[j++];
                }
            }
            while(i<n){
                arr3[k++]=arr1[i++];
            }
            while(j<m){
                arr3[k++]=arr1[i++];
            }
        
           
    }
    public static void main(String[] args) {
        int arr1[]={5,9,15,25,36,41,50};
        int n=arr1.length;

int arr2[]={3,4,5,10,19,47};
int m=arr2.length;

int[] arr3=new int [m+n];

mergesorted(arr1, arr2, n, m, arr3);
for(int i=0;i<m+n;i++){
    System.out.print(arr3[i]+" ");
}
    }

}
