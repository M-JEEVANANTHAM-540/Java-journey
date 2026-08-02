public class Reverse_an_array {
    public static void main(String args[]){
        int arr[]={7,8,6,6,2,1,47,32};
        int rev_arr[]=new int[arr.length];
        int i=0;
        int j=arr.length-1;
        while (i<arr.length){
            rev_arr[i]=arr[j];
            i++;
            j--;
        }
        for (int k=0;k<rev_arr.length;k++){
            System.out.print(rev_arr[k]+" ");

        }
            
    }
}
