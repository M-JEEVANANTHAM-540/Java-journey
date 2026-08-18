public class Check_array_is_sorted {
    public static void main(String args[]){
        int arr[]={1,2,9,10};
        boolean sorted=true;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        if (sorted){
            System.out.println("The given array is sorted");
        }
        else{
            System.out.println("The given array is not sorted");
        }
        
    }
}
