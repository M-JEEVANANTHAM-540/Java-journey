public class sec_large_element_in_array {
    public static void main(String args[]){
        int arr[]={5,3,65,45,98,52,45,77,21,33};
        int larg=Integer.MIN_VALUE;
        int sec_larg=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>larg){
                sec_larg=larg;
                larg=arr[i];
            }else if (arr[i]<larg && arr[i]>sec_larg){
                sec_larg=arr[i];
            }}
        if (sec_larg==Double.NEGATIVE_INFINITY){
            System.out.println(-1);
        }else{
            System.out.printf("The second largest in the array is %d",sec_larg);}}}
