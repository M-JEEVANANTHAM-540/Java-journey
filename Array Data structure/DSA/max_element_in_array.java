//Find the maximum element in a array
public class max_element_in_array{
    public static void main(String args[]){
        int array[]={5,4,8,6,3,8};
        int max=array[0];
        for (int i=0;i<array.length;i+=1){
            
            if (array[i]>=max){
                max=array[i];
            }
        }
        System.out.println("The maximum number in the array is "+max);
    }
}
