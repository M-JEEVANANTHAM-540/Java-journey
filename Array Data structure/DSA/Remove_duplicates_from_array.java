import java.util.Arrays;
import java.util.Scanner;

public class Remove_duplicates_from_array {
    public static void main(String args[]){
        System.out.println("Enter no of elements you want in the array:\n");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int dup_arr[]=new int[size];
        System.out.printf("Enter %d elements to store in the array: \n",size);
        for (int i=0;i<size;i++){
            dup_arr[i]=sc.nextInt();
        }
        System.out.println("The array you entered is \n");
        Arrays.sort(dup_arr);
        for (int j=0;j<dup_arr.length;j++){
            System.out.print(dup_arr[j]+" ");}
        int left=0;
        int right=1;
        while (right<dup_arr.length){
            if (dup_arr[left]!=dup_arr[right]){
                left++;
                dup_arr[left]=dup_arr[right];
                right++;
}
            else{
                right++;
            }
        }
        int arr[]=new int[left+1];
        System.out.println("\nEntered array with unique elements:\n");
        for (int k=0;k<left+1;k++){
            System.out.print(dup_arr[k]+" ");
        }

    }
}
