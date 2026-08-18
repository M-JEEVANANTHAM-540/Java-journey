import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Missing_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements you want in the array :");
        int size=sc.nextInt();
         int arr[]=new int[size];
        System.out.printf("Enter %d elements in the array: \n",size);
        ArrayList<Integer> normal=new ArrayList<>(); 
        ArrayList<Integer> miss_no=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt(); 
        }
        Arrays.sort(arr);
        for (int j=1;j<=arr[arr.length-1];j++){
            normal.add(j); 
        }
        for (int num:normal){
            boolean found=false;
            for (int val:arr){
                if(num==val){
                    found=true; 
                    break; 
                }
            }
           if (!found) {
            miss_no.add(num); 
        }
    }
        System.out.println("The missing elements are ");
        System.out.print(miss_no);
        sc.close();
    }
}
