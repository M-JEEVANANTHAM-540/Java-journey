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
        System.out.println("The array you entered is \n");
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");}
        System.err.println("\nEnter the two sum to find in the array:");
        int target=sc.nextInt();
        boolean found=false;
        for (int k=0;k<arr.length;k++){
            for (int l=k+1;l<arr.length;l++){
                if (arr[k]+arr[l]==target){
                    System.out.printf("The possible combination is %d and %d%n",arr[k],arr[l]);
                    found=true;
                    break; }}
            if (found){
               break;}}
        if (!found){
             System.out.println("The entered two sum is not found in the array");}}}
