package TwoPointer;

public class MaximumSumwindow {
    public static int constantWindow(int arr[],int k){
        int maxsum=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            maxsum+=arr[i];
        }
        int l=0;
        int r=k-1;
        int sum=maxsum;
        while(r<n-1){
            sum-=arr[l];
            l++;
            r++;
            sum+=arr[r];
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={-1,2,3,3,4,5,-1};
        int k=4;
        System.out.println(constantWindow(arr,k));
    }
}
