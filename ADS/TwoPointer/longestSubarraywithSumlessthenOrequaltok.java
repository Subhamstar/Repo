package TwoPointer;

public class longestSubarraywithSumlessthenOrequaltok {
    public static int maximum(int arr[],int k){
        int sum=0;
        int l=0,r=0;
        int n=arr.length;
        int maxsum=0;
        while(r<n){
            sum+=arr[r];
            r++;
            if(sum<=k)
            maxsum=Math.max(r-l,maxsum);
            else{
                l++;
            }

        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,7,10};
        int k=7;
        System.out.println(maximum(arr,k));
    }
}
