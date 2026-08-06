import java.util.Arrays;
import java.util.Scanner;
public class Binary_search{
    public static void main(String[] args) {
        boolean found=false;
        System.out.println("Enter the size of the array: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.printf("Enter %d elements in the array\n",size);
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Elements entered in the array after sorted: \n");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the target element: ");
        int target=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (arr[mid]==target){
                System.out.printf("The target element is found at the index of %d",mid);
                found=true;
                break;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }}if(!found){System.out.println("The target element is not found in the array");}
        sc.close();}}