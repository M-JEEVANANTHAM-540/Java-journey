import java.util.Arrays;
import java.util.Scanner;
public class Two_sum {
    public static void main(String[] args) {
        System.out.println("Enter no of elements you want in the array:\n");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.printf("Enter %d elements to store in the array: \n",size);
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();}
           Arrays.sort(arr);
        System.out.println("The array you entered is \n");
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");}
        System.err.println("\nEnter the two sum to find in the array:");
        long target=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        boolean found=false;
        while(left<right && (!found)){
            long sum=(long)arr[left]+arr[right];
            if(sum==target){
                System.out.printf("The two sum combination in the array is %d and %d%n ",arr[left],arr[right]);
                found=true;
                 break; }
            else if(sum<target){
                left++;
            }
            else if(sum>target){
                right--; 
            }
        }
        if(!found){
            System.out.println("The entered sum is not found in the entered array"); } sc.close();}}