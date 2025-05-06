package TwoPointer;

public class longestSubarraywithSumlessthenOrequaltok {
    public static int maximum(int arr[],int k){
        int sum=0;
        int l=0,r=0;
        int n=arr.length;
        int maxlen=0;
        while(r<n){
            sum+=arr[r];
            if(sum<=k)
            maxlen=Math.max(r-l+1,maxlen);
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            r++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,7,10}; 
        int k=14;
        System.out.println(maximum(arr,k));
    }
}
