public class maxSubarraySum_prefixSum {

    public static void maxSubarraySum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        //calculate prefix array
        prefix[0]=numbers[0];

for(int i=1;i<prefix.length;i++){
prefix[i]=prefix[i-1]+numbers[i];
}

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                if(start==0){
                    currSum=prefix[end];
                }
                    else{
                currSum=prefix[end]-prefix[start-1];
              
                }

                // currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];

                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxSubarraySum(numbers);
    }
}
