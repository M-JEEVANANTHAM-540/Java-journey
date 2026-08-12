public class  Maximum_subarray_sum{
    public static void main(String args[]){
        int arr[]={1,-2,9,-4,2,-6};
        int current_sum=arr[0];
        int Max_sum=arr[0];
        for (int i=1;i<arr.length;i++){
            current_sum=Math.max(arr[i],current_sum+arr[i]);
            Max_sum=Math.max(current_sum,Max_sum);
        }
        System.out.printf("Maximum Subarray sum is %d",Max_sum);

    }}