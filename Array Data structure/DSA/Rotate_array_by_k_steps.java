import java.util.Scanner;
public class Rotate_array_by_k_steps {
    public static void main(String args[]){
        System.out.println("Enter no of elements you want in the array:\n ");
        java.util.Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.printf("Enter %d elements to store in the array: \n",size);
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();}
        System.out.println("The array you entered is :\n");
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");}
        int left=0;int right=arr.length-1;int temp;
        while(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;right--;}
        System.out.println("Enter no of step to rotate the array: \n");
        int k=sc.nextInt();
        k%=arr.length;int t;int l=0;int r=k-1;
        while(l<r){
            t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;r--;}
        int te;int le=k;int ri=arr.length-1;
        while(le<ri){
            te=arr[le];
            arr[le]=arr[ri];
            arr[ri]=te;
            le++;ri--;}
        System.out.printf("The array rotated by %d steps is \n",k);
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");}}}
