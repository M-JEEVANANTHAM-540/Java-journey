//[0,0,0,1,2]

public class Moving_zeroes_to_end {
    public static void main(String args[]){
       
        int left=0;
        int right=1;
         int arr[]={0,0,0,1,2};
        while (right<arr.length){
            if (arr[right]!=0){
                arr[left]=arr[right];
                right++;
                left++;
            }
            else{
                right++;
            }}
            for (int i=left;i<arr.length;i++){
                arr[i]=0;}
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" "); }}}

