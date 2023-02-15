import java.util.*;

public class paintersPartitionProblem{

public static int findFeasible(int boards[],int n,int limit){
	int sum=0,painters=1;
	for(int i=0;i<n;i++){
		sum+=boards[i];
		if(sum>limit){
			sum=boards[i];
			painters++; //hum nya painter le aayenge
		}
	}
	return painters;
}


	public static int paintersPartition(int boards[],int n,int m){
		int totalLength=0,k=0;
		//in binary search maxValue is total length
		//and minimum value is k

		for(int i=0;i<n;i++){
			k=Math.max(k,boards[i]);
			totalLength+=boards[i];
		}


		int low=k,high=totalLength;
		while(low<high){
			int mid=(low+high)/2;
			int painters=findFeasible(boards, n, mid);
			if(painters<=m){
				high=mid;
			}
			else{
				low=mid+1;
			}
		}
		return low;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

 int paintings=0;

        int[] arr=new int[100000];

        while(sc.hasNext()){
            arr[paintings++]=sc.nextInt();
        }

		// int arr[]={1,10};
		// int n=2;
		// int m=5;

		System.out.println(paintersPartition(arr, n, m));
	}
}