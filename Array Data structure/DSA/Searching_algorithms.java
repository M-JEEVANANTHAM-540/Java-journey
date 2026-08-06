import java.util.Scanner;
public class Searching_algorithms{
    //Linear searching
public static void main(String args[]){
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        int arr[]={5,6,4,56,7,86,9,7,45,236,};
        int i;
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        for (i=0;i<arr.length;i++){
            if (arr[i]==target){
                found=true;
                break;
            }}
        if (!found){
            System.out.println("Target is not found in array");
        }
        else{
            System.out.printf("target is found at the array in index of %d",i);}}}
